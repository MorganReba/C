#define _CRT_SECURE_NO_WARNINGS 1

#include "SeqList.h"
#include <assert.h>

void SeqListInit(SeqList* pq)//��ʼ��
{
	assert(pq); //���� pq!=NULL �ж�Ϊ����ֹ�ļ�

	pq->a = NULL;
	pq->size = pq->capacity = 0;
}

void SeqListDestory(SeqList* pq)//����
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

//�ȼ������
void SeqCheckCapacity(SeqList* pq)
{
	//���ˣ���Ҫ����
	if (pq->size == pq->capacity)
	{
		int newcapacity = pq->capacity == 0 ? 4 : pq->capacity * 2;
		//SeqDataType* newA = malloc(sizeof(SeqDataType)*newcapacity); //��һ��
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

void SeqListPushBack(SeqList* pq, SeqDataType x)//β������
{
	assert(pq);

	SeqCheckCapacity(pq);
	
	pq->a[pq->size] = x;
	pq->size++;
}

void SeqListPushFront(SeqList* pq, SeqDataType x)//ͷ������
{
	assert(pq);

	SeqCheckCapacity(pq);

	//malloc����ֻ����β����
	//ֻ��Ų����-�Ӻ���ǰ
	int end = pq->size - 1;//������ݵ�λ��
	while (end >= 0)
	{
		pq->a[end + 1] = pq->a[end];
		--end;

	}
	pq->a[0] = x;
	pq->size++;
}

void SeqListPopBack(SeqList* pq)//βɾ
{
	assert(pq);
	assert(pq->size > 0);

	--pq->size;
}
void SeqListPopFront(SeqList* pq)//ͷɾ
{

}