using System;
using System.Diagnostics;
namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            Random rr = new Random();
            Stopwatch sw = new Stopwatch();
            Console.WriteLine("{0}에 대해 계산합니다.",int.MaxValue);
            sw.Reset();
            sw.Start();
            for(int i =-1; i !=2147483647; i++ )
            {
                rr.Next(0, 0);
            }
            sw.Stop();  
            Console.WriteLine("OK 모든 계산이 완료되었습니다.");        
            Console.WriteLine("수행 시간 : {0} 초 소모", sw.ElapsedMilliseconds / 1000.0F);
            Console.ReadLine();
        }
        
    }
}
