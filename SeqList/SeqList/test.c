#define _CRT_SECURE_NO_WARNINGS 1

#include "SeqList.h"

void TestSeqList1()
{
	SeqList s;
	SeqListInit(&s);

	SeqListPushBack(&s, 1);
	SeqListPushBack(&s, 2);
	SeqListPushBack(&s, 3);
	SeqListPushBack(&s, 4);
	SeqListPushBack(&s, 5);
	SeqListPushFront(&s, 0);
	SeqListPushFront(&s, 0);
	SeqListPushFront(&s, 0);
	SeqListPushFront(&s, 0);
	SeqListPushFront(&s, 0);

	SeqListPrint(&s);

	SeqListDestory(&s);

	//≤‚ ‘∂œ—‘
	//SeqList* p = NULL;
	//SeqListInit(p);
}

int main()
{
	TestSeqList1();

	return 0;
}