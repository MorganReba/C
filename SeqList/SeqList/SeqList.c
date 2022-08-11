#define _CRT_SECURE_NO_WARNINGS 1

#include "SeqList.h"
#include <assert.h>

void SeqListInit(SeqList* pq)//初始化
{
	assert(pq); //断言 pq!=NULL 判断为假中止文件

	pq->a = NULL;
	pq->size = pq->capacity = 0;
}

void SeqListDestory(SeqList* pq)//销毁
{
	assert(pq);

	free(pq->a);
	pq->a = NULL;
	pq->capacity = pq->size = 0;
}

void SeqListPrint(SeqList* pq)
{
	assert(pq);

	for (int i = 0; i < pq->size; ++i)
	{
		printf("%d ", pq->a[i]);
	}
	printf("\n");
}

//先检查容量
void SeqCheckCapacity(SeqList* pq)
{
	//满了，需要增容
	if (pq->size == pq->capacity)
	{
		int newcapacity = pq->capacity == 0 ? 4 : pq->capacity * 2;
		//SeqDataType* newA = malloc(sizeof(SeqDataType)*newcapacity); //增一个
		SeqDataType* newA = realloc(pq->a, sizeof(SeqDataType)*newcapacity);
		if (newA == NULL)
		{
			printf("realloc fail\n");
			exit(-1);
		}

		pq->a = newA;
		pq->capacity = newcapacity;
	}


}

void SeqListPushBack(SeqList* pq, SeqDataType x)//尾部插入
{
	assert(pq);

	SeqCheckCapacity(pq);
	
	pq->a[pq->size] = x;
	pq->size++;
}

void SeqListPushFront(SeqList* pq, SeqDataType x)//头部插入
{
	assert(pq);

	SeqCheckCapacity(pq);

	//malloc扩容只能在尾部插
	//只能挪数据-从后往前
	int end = pq->size - 1;//最后数据的位置
	while (end >= 0)
	{
		pq->a[end + 1] = pq->a[end];
		--end;

	}
	pq->a[0] = x;
	pq->size++;
}

void SeqListPopBack(SeqList* pq)//尾删
{
	assert(pq);
	assert(pq->size > 0);

	--pq->size;
}
void SeqListPopFront(SeqList* pq)//头删
{

}