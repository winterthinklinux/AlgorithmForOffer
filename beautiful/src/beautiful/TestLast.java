package beautiful;

public class TestLast {
	//测试用例的设计//string==null和string.length==0的区别
	//不得不注意了，卡了我半个小时
	public static int lengthOfLastWord(String s) {
		if(s==null) return 0;
        String []  strings = s.split("\\s+");
        if(strings==null) return 0;
        return strings[strings.length-1].length();
    }
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord(""));
	}
}
