Scanner obj = new Scanner(System.in);

        float a = obj.nextFloat();
        
        int b = obj.nextFloat();
        int c = obj.nextFloat();
        if(a<1 && a>1000 && b<1 && b>1000 && c<1 && c>1000)
        {
            System.out.println(a+b+c/3);
        }