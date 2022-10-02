package TaskVonMentor;

public class A {

    int count;
    public void m(){
        count++;
    }

    public void m(int n){
        count *= n;
    }

    public static void main(String[] args) {

        A ojb = new A();
        ojb.m(5);
        ojb.m();
        ojb.count += 10;
        ojb.m(2);

        System.out.println(ojb.count);
    }

}
