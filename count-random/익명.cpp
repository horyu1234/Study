#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;
int main()
{
  double time;
  clock_t start, finish;
  start = clock();
  cout << "시작합니다." << endl;
  int num = 0;
  for (int i = 0; i < 2147483647; i++)
  {
    rand()%255 ;
  }
  finish = clock();
  
  time = (double)(finish - start) / CLOCKS_PER_SEC;
  printf(" %0.3f\n", time);
}
