 class Main {
    public static void main(String[] args) {
        String a= "t6hj7ui";
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < a.length(); i++) 
        {
            char cha1 = a.charAt(i);

              if (Character.isLetter(cha1)) {
                temp.append(cha1); 
            } 
            else if (Character.isDigit(cha1))
         {
                int count = Character.getNumericValue(cha1);
                for (int j = 0; j < count; j++) {
                    result.append(temp);
                }
                temp.setLength(0); 
            } 
      else
            {
                result.append(cha1); 
            }
        }
        result.append(temp);

        System.out.println(result);
    }
}