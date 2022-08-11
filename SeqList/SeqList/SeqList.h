#define _CRT_SECURE_NO_WARNINGS 1

#pragma once //为了避免同一个头文件被包含（include）多次
#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

////静态的顺序表-不实用，可能造成空间浪费
//#define N 100
//struct SeqList
//{
//	int a[N];
//	int size;
//};

//动态
//realloc-扩容

typedef int SeqDataType;

typedef struct SeqList
{
	int* a;
	int size; //有效数据个数
	int capacity; //容量空间的大小
}SeqList, SEQ;

//内存中管理数据的结构增删查改的接口
void SeqListInit(SeqList* pq);//初始化
void SeqListDestory(SeqList* pq);//销毁

void SeqListPushBack(SeqList* pq, SeqDataType x);//尾部插入
void SeqListPushFront(SeqList* pq, SeqDataType x);//头部插入
void SeqListPopBack(SeqList* pq);//尾删
void SeqListPopFront(SeqList* pq);//头删

