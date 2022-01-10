package ch09;
/*
 * ��¥ 2022.01.10
 * �̸� ������
 * ���� �ڹ� Object ����Ŭ���� �ǽ� p284
 */
public class Sub03_Wrapper {
	public static void main(String[] args) {
		
		//�⺻Ÿ�� ����(primitive type)
		int var1 = 1;
		double var2 = 2;
		boolean var3 = true;
		
		//Wrapper Ŭ������ ����(Auto-Boxing)
		Integer w1 = var1;
		Double w2 = var2;
		Boolean w3 = var3;
		//���ڿ� >> �⺻Ÿ�� ��ȯ
		String str1 = "1";
		String str2 = "2.3";
		String str3 = "false";
		
		int rs1 = Integer.parseInt(str1);
		double  rs2 = Double.parseDouble(str2);
		boolean rs3 = Boolean.parseBoolean(str3);
		System.out.println(rs1);
		System.out.println(rs2);
		System.out.println(rs3);
		
		//���ڿ� >> Wrapper ��ȯ
		Integer wr1 = Integer.valueOf(str1);
		Double wr2 = Double.valueOf(str2);
		Boolean wr3 = Boolean.valueOf(str3);
		
		System.out.println(wr1);
		System.out.println(wr2);
		System.out.println(wr3);
		
		//Wrapper >> ���ڿ� ��ȯ
		String s1 = wr1.toString();
		String s2 = wr2.toString();
		String s3 = wr3.toString();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//Wrapper >> �⺻Ÿ�� ��ȯ(Auto-Unboxing)
		
		int v1 = wr1;
		double v2 = wr2;
		boolean v3 = wr3;
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		
		
		
		
	}

}