package mianxiangduixiangExample;

public class Test {
    public static void main(String[] args) {
//    1.创建对象
      Movie m1 = new Movie("《我是传奇》", 9.8, "威尔史密斯");
      Movie m2 = new Movie("《千与千寻》", 9.6, "宫崎骏");

//    2.储存（储存int对象变为Movie对象）
      Movie[] movies =  new Movie[3];
      movies[0] = m1;
      movies[1] = m2;
      movies[2] = new Movie("《泰坦尼克》", 9.8, "小李子");

//    3.遍历
        for (int i = 0; i < movies.length; i++) {
            Movie m_info = movies[i];
            System.out.println("名称：" + m_info.getName());
        }
    }
}
