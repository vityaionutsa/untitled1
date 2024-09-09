public class Convert {
        public static String intToRoman(int num) {
            String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

            StringBuilder roman = new StringBuilder();
            if(num<=0 || num>=4000)
            {
                return null;
            }

            for (int i = 0; i < values.length; i++) {
                while (num >= values[i]) {
                    roman.append(romanNumerals[i]);
                    num -= values[i];
                }
            }
            return roman.toString();
        }
}
