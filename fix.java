class Main {
    public static void main(String[] args) {
        int n=10;
        int x=10;
        int o=10;
        int u=n++ + ++n + ++n + n++ + ++n;
        int y= --x + --x + --x + --x;
        int h=--o + o++ + ++o + --o + o++;
        System.out.println(u);
        System.out.println(y);
        System.out.println(h);
    }
}