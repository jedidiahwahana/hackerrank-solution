//Write your code here
class MyRegex{
    //Pattern : 1 or 2 digits OR 0 or 1 + 2 digits OR 2 + 0-4 + 1 digit OR 25 + 0-5
    String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
}
