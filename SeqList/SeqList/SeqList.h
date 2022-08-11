#define _CRT_SECURE_NO_WARNINGS 1

#pragma once //Ϊ�˱���ͬһ��ͷ�ļ���������include�����
#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

////��̬��˳���-��ʵ�ã�������ɿռ��˷�
//#define N 100
//struct SeqList
//{
//	int a[N];
//	int size;
//};

//��̬
//realloc-����

typedef int SeqDataType;

typedef struct SeqList
{
	int* a;
	int size; //��Ч���ݸ���
	int capacity; //�����ռ�Ĵ�С
}SeqList, SEQ;

//�ڴ��й������ݵĽṹ��ɾ��ĵĽӿ�
void SeqListInit(SeqList* pq);//��ʼ��
void SeqListDestory(SeqList* pq);//����

void SeqListPushBack(SeqList* pq, SeqDataType x);//β������
void SeqListPushFront(SeqList* pq, SeqDataType x);//ͷ������
void SeqListPopBack(SeqList* pq);//βɾ
void SeqListPopFront(SeqList* pq);//ͷɾ

