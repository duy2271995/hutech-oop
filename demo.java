class instanceOfDemo {
    public static void main(String args[]) {
        instanceOfDemo t = new instanceOfDemo();
        if (t instanceof instanceOfDemo)
            System.out.println("t is in instance.");
        else
            System.out.println("t is not in instance.");
    }
}