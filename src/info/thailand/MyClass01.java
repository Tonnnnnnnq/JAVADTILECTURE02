// Access Modifier of class -> default, public
// Access Modifier of member -> default, public, private, protected
package info.thailand;

public class MyClass01 {
    //องค์ประกอบของคลาส Member of class มีแค่ 2 อย่าง --------------------
    //data member (data, field, attribute, property)
    int dataA = 0;
    public int dataB = 0;
    private int dataC = 0;
    protected int dataE = 0;


    //method member คือ ฟังก์ชันแบบหนึ่ง-----------------------------
    void met1() {
        int score = 0; //ตัวแปร
    }
    public void met2(){}
    private void met3(){}
    protected void met4(){}

}
