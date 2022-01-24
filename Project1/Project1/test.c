#define _CRT_SECURE_NO_WARNINGS 1

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//作业：写一个函数求两个整数的较大值
int Max(int x, int y)
{
	return x > y ? x : y;
}

int main()
{
	int a = 0;
	int b = 0;
	while (scanf("%d %d", &a, &b) != EOF)
	{
		int max = Max(a, b);
		printf("max = %d\n", max);
	}

	return 0;
}

//结构体
//struct Stu
//{
//	char name[20];
//	int age;
//	char sex[10];
//	char id[20];
//};
//
//int main()
//{
//	struct Stu s = { "张三", 20, "男", "19060516123" };
//	printf("%s %d %s %s\n", s.name, s.age, s.sex, s.id);
//
//	struct Stu* ps = &s;
//	printf("%s %d %s %s\n", ps->name, ps->age, ps->sex, ps->id);
//
//	return 0;
//}

//指针变量的大小
//int main()
//{
//	printf("%d\n", sizeof(int*));
//	printf("%d\n", sizeof(short*));
//	printf("%d\n", sizeof(char*));
//	printf("%d\n", sizeof(float*));
//	printf("%d\n", sizeof(double*));
//
//	return 0;
//}

//关键字
//static
//void test()
//{
//	int a = 0;
//	a++;
//	printf("%d ", a);//10个1
//}

//void test()
//{
//	static int a = 0;
//	a++;
//	printf("%d ", a);//1 2 3 4 5 6 7 8 9 10
//}
//
//int main()
//{
//	int i = 0;
//	while (i < 10)
//	{
//		test();
//		i++;
//	}
//
//	return 0;
//}

//前置++ 后置++
//int main()
//{
//	int a = 10;
//	int b = ++a;
//
//	printf("%d\n", b);//11
//	printf("%d\n", a);//11
//
//	//printf("%d\n", a++);//10
//	//printf("%d\n", a);//11
//
//	return 0;
//}

//Add()和函数
//int Add(int x, int y)
//{
//	return x + y;
//}
//
//int main()
//{
//	int num1 = 0;
//	int num2 = 0;
//	scanf("%d %d", &num1, &num2);
//
//	int sum = Add(num1, num2);
//	printf("sum = %d\n", sum);
//
//	return 0;
//}

//转义字符
//int main()
//{
//
//	printf("%c\n", '\'');//打印'字符
//
//	printf("%c\n", '\130');// \ddd-八进制
//	printf("%c\n", '\x30');// \xdd-十六进制
//
//	//打印c:\code\test.c
//	printf("c:\code\\test.c");//  \\
//
//	return 0;
//}

//int main()
//{
//	printf("%d\n", strlen("abcdef"));
//	printf("%d\n", strlen("c:\test\328\test.c"));
//	printf("c:\test\328\test.c");
//
//	return 0;
//}

//字符串结束的标志-\0
//int main()
//{
//	char arr1[] = "bit";
//	char arr2[] = { 'b', 'i', 't' };
//	char arr3[] = { 'b', 'i', 't', '\0' };
//
//	printf("%s\n", arr1);
//	printf("%s\n", arr2);
//	printf("%s\n", arr3);
//
//	//\0不算进字符串长度
//	printf("%d\n", strlen(arr1));
//	printf("%d\n", strlen(arr2));
//	printf("%d\n", strlen(arr3));
//
//	return 0;
//}

//枚举常量
//enum Sex
//{
//	MALE,
//	FEMALE,
//	SECRET
//};
//
//int main()
//{
//	enum Sex sex = MALE;
//
//	printf("%d\n", MALE);
//	printf("%d\n", FEMALE);
//	printf("%d\n", SECRET);
//
//	return 0;
//}

//extern-声明外部符号
//extern int g_val;
//int main()
//{
//	printf("%d\n", g_val);
//	return 0;
//}

//int main()
//{
//	int num1 = 0;
//	int num2 = 0;
//	scanf("%d %d", &num1, &num2);
//	int sum = num1 + num2;
//	printf("%d\n", sum);
//
//	return 0;
//}

//int a = 100;//全局变量
//
//int main()
//{
//	int a = 10;//局部变量
//	printf("%d\n", a);
//
//	return 0;
//}


//int main()
//{
//	printf("%d\n", sizeof(char));
//	printf("%d\n", sizeof(short));
//	printf("%d\n", sizeof(int));
//	printf("%d\n", sizeof(long));
//	printf("%d\n", sizeof(long long));
//	printf("%d\n", sizeof(float));
//	printf("%d\n", sizeof(double));
//	printf("%d\n", sizeof(long double));
//
//	return 0;
//}


//hello world
//int main()
//{
//	printf("hello world\n");
//	return 0;
//}