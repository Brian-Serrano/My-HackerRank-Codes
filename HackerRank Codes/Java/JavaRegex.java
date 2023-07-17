class MyRegex {
    private String from0to255 = "(25[0-50]|2[0-4][0-9]|[01]?[0-9]?[0-9])";
    public String pattern = String.format("%s.%s.%s.%s", from0to255, from0to255, from0to255, from0to255);
}