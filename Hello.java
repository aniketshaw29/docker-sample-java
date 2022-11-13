class Hello{
    public static void main(String[] args) {
        System.out.println("OS Details: "+System.getProperty("os.name"));
        System.out.println("User Details: "+System.getProperty("user.name"));
        System.out.println("VM Details: "+System.getProperty("java.vm.name"));
        System.out.println("Vendor Details: "+System.getProperty("java.vendor"));
    }
}