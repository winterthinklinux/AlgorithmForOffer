package beautiful;

public class TestLast {
	//�������������//string==null��string.length==0������
	//���ò�ע���ˣ������Ұ��Сʱ
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
