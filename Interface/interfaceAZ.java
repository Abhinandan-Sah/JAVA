package Interface;

interface Program{
    public void run();
    
}

class AZ implements Program{
    public void run(){
        System.out.println("hi");
    }
}

class interfaceAZ{
    public static void main(String[] args){
        AZ pa = new AZ();
        pa.run();
            
        
    }
}


