package kaljebi;

class KaljebiParent{
   static private KaljebiParent instance = null;//실제 사용객체
   private int count =0;
   
   static public KaljebiParent get() {
      if(instance == null) {//인스탄스가 널과 같다면
         instance = new KaljebiParent();
      }
      return instance;
   }
   public void count() {count++;}
   public int getCount() {return count;}
}


public class Kaljebi {//엄마가 힘에 부치니 니가 헤다오 상속

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      KaljebiParent child1 = KaljebiParent.get();
      child1.count();//싱글인 프로그램 나는솔로, 자바는 싱글톤
      System.out.println(child1.getCount());
      KaljebiParent child2 = KaljebiParent.get();
      child2.count();
      System.out.println(child2.getCount());
   }

}
