class First
{
        static void oneFun()		//static method
        {
                System.out.println("oneFun of First");
        }

        void fun()
        {
                System.out.println("fun of First");
                myFun();
                oneFun();
        }

        private void myFun()		//private method
        {
                System.out.println("myFun of First");
        }
}

class Second extends First
{
        static void oneFun()                    //Method hiding and not overriding
        {
                System.out.println("oneFun of Second");
        }
        
        void myFun()                    //Method Hiding and not Method Overriding
        {
                System.out.println("myFun of Second");
        }

}

class MethodHidingDemo
{
        public static void main(String args[])
        {
                Second s = new Second();
                s.fun();
                
                //First f = new Second();
                //f.fun();
        }
}