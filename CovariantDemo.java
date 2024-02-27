class First
{
}

class Second extends First
{
}

class Third extends Second
{
}

class Fourth
{
}

class Demo
{
        First myFun()
        {
                System.out.println("myFun of Demo");
                return new First();
        }

      
 	int anotherFun()
        {
                System.out.println("anotherFun of Demo");
                return 5;
        }

}

class MyDemo extends Demo
{
        Third myFun()
        {
                System.out.println("myFun of MyDemo");
                return new Third();
        }

       int anotherFun()					//incompatible types compilation error in the case of primitive return		
        {
                System.out.println("anotherFun of MyDemo");
                return 5;
        }
}

class CovariantDemo
{
        public static void main(String args[])
        {
                MyDemo md = new MyDemo();
                md.myFun();
                md.anotherFun();
        }

}