package com.md.shop.utils;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.UUID;

import org.springframework.util.FileCopyUtils;

import net.coobird.thumbnailator.Thumbnails;

public class UploadFileUtils {

	static final int THUMB_WIDTH = 300;
	static final int THUMB_HEIGHT = 300;
	
	public static String fileUpload(String uploadPath, String fileName, byte[] fileData, String ymdPath) throws Exception{
		
		UUID uid = UUID.randomUUID();
		
		String newFileName = uid + "_" + fileName;//파일명
		String imgPath = uploadPath + ymdPath;//경로
		
		File target = new File(imgPath, newFileName);//객체(이미지패스, 파일명)
		FileCopyUtils.copy(fileData, target);//복사 (파일데이터와 타겟)
		
		String thumbFileName = "s_" + newFileName;
		File image = new File(imgPath + File.separator + newFileName);
		
		File thumbnail = new File(imgPath + File.separator + "s" + File.separator + thumbFileName);
		
		if(image.exists()) {
			thumbnail.getParentFile().mkdirs();
			Thumbnails.of(image).size(THUMB_WIDTH, THUMB_HEIGHT).toFile(thumbnail);
		}
		return newFileName;		
	}
	
	
	public static String calcPath(String uploadPath) {
		Calendar cal = Calendar.getInstance();
		String yearPath = File.separator + cal.get(Calendar.YEAR);
	    String monthPath = yearPath + File.separator + new DecimalFormat("00").format(cal.get(Calendar.MONTH)+1);
	    String datePath = monthPath + File.separator + new DecimalFormat("00").format(cal.get(Calendar.DATE));
	    
	    makeDir(uploadPath, yearPath, monthPath, datePath);
	    makeDir(uploadPath, yearPath, monthPath, datePath + "\\s");
	    return datePath;
	}
	
	private static void makeDir(String uploadPath, String...paths) {
		if (new File(paths[paths.length - 1]).exists()) {return;}
		for(String path:paths) {
			File dirPath = new File(uploadPath + path);
			
			if(!dirPath.exists()) {
				dirPath.mkdir();
			}
		}
	}
	/*날짜 (연/월/일)로 구성된 폴더를 생성하고 같은 파일명이라도 중복되지 않도록 랜덤문자와 파일명을 조합한뒤 생성된 폴더에 저장하며 
	썸내일을 생성하여 별도의 폴더에 저장합니다
	 */
	
	
	
	
	
	
	
	
	
	
	
	
}
