package reflection;

public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //三种方式
        Class<?> aClass = Class.forName("reflection.Student");
        Class<GetClass> getClassClass = GetClass.class;
        GetClass getClass = new GetClass();
        Class<? extends GetClass> aClass1 = getClass.getClass();
        double random = Math.random();

        Student student = (Student) aClass.newInstance();

    }
}
