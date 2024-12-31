package com.md.shop.domain;

import java.util.Date;

public class ReplyVO {
	
	private int gdsNum;
	private String userId;
	private int repNum;
	private String repCon;
	private Date repDate;
	
	public int getGdsNum() {return gdsNum;}
	public String getUserId() {return userId;}
	public int getRepNum() {return repNum;}
	public String getRepCon() {return repCon;}
	public Date getRepDate() {return repDate;}
	
	public void setGdsNum(int gdsNum) {this.gdsNum = gdsNum;}
	public void setUserId(String userId) {this.userId = userId;}
	public void setRepNum(int repNum) {this.repNum = repNum;}
	public void setRepCon(String repCon) {this.repCon = repCon;}
	public void setRepDate(Date repDate) {this.repDate = repDate;}
	
	

}
/*
VO(Value Object) or DTO(data transfer object)��� ��
�� ������ ���� �����ϴ� ������� Map�� �����
Map�� ����
- ������ �����ؼ� ���濡 ���ϴ� but ���� ���� �ִ��� �����ϱ� ���� �ƹ��� �𸥴ٴ� ������ �ִ�
- �ݸ鿡 VO(Value Object)�� ���� �̸��� Ÿ���� �̸� �����ؼ� ����ϴ� ����Դϴ�.
- �ڵ常 ���� ���빰�� �ľ��� �� �ִ� ����[�ڵ��ϼ��� �ȴٴ� �ִ�����]�� �ִµ� but �ڵ带 �� ���� ����ϹǷ� ���ŷӴٴ� ������ ����.
- ������Ʈ�� �ϴٰ� ������Ģ�� �߿��ϰ� ����� AA, PM�� ������ �ݵ�� VO �� ����ϼ���~ �ϴ� ��ħ�� �޴´�.

* PM(project manager) ������Ʈ �Ѱ�(��) : ��� ���������� å������ ��� -  Ŀ�´����̼� 
* PL(project leader) :pm�� ���ͼ� ������Ʈ�� ������ ���, ����, �����ɷ�, ��ޱ�� �� Ŀ�´����̼� - ���ΰ�������
* AA(application architect) : �������, ����ǥ��, �����ӿ�ũ �� ������� ������
* TA(technical architect), OS, WEB,WAS,DB��ġ �� �ϵ����� ��Ʈ��ũ ����
* DA(data architect) : ������ ǥ��, ����, ǰ��, ���̱׷��̼� �� DB������
* QA(quality assurance) : ���⹰�� �ҽ��ڵ忡 ���� ǰ���� �����ϴ� �����
* BA(business architect) : ����� ������ �ƴ� �����Ͻ� ������ ���μ��� ������
* ������(developer) : ������Ʈ�� ���ϴܿ��� ���� ������ �����ϴ� ���
*/
