static Scanner sc;
static boolean flag;
static int B;
static int H;

static {
    sc = new Scanner(System.in);
    B = sc.nextInt();
    H = sc.nextInt();
    try {
        if(B <= 0 || H <= 0){
            flag = false;
            throw new Exception("Breadth and height must be positive");
        }
        else {
            flag = true;
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
}