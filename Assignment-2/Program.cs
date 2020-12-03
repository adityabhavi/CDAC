using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InheritanceExample
{
    class Program
    {
        static void Main(string[] args)
        {
            Employee e1 = new Manager("abc", 3, 2000, "tech-manager");
            Employee e2 = new GeneralManager("xyz", 3,20000 ,"bhaiya ji", "CEO");
            Employee e3 = new CEO("Aditya", 5, 1000);
            Console.WriteLine(e3.CalcNetSalary());
            Console.WriteLine(e2.CalcNetSalary());

            Console.WriteLine(e1.CalcNetSalary());
            Console.WriteLine(e1.EmpNo);
            Console.WriteLine(e2.EmpNo);
            Console.WriteLine(e3.EmpNo);
            Console.ReadLine();
        }
    }

    public abstract class Employee
    {

        public Employee(string name = null, decimal basic = 0 , short deptNo =0 )
        {
            empNo = ++eno;
            this.Name = name;
            this.Basic = basic;
            this.DeptNo = deptNo;
                
        }


        public abstract decimal CalcNetSalary();

        private string name;
        public string Name
        {
            set
            {
                if(value != null)
                {
                    name = value;
                }
                else
                {
                    Console.WriteLine("Invalid Name Emtry");
                }
            }
            get
            {
                return name;
            }
        }
        protected decimal basic;

        public abstract decimal Basic
        {
            set;
            get;
        }

        private static int eno;
        public static int ENO
        {
            set
            {
                eno = 0;
            }
            get
            {
                return eno;
            }
        }

        private int empNo;
        public int EmpNo
        {
            get
            {
                return empNo;
            }
        }

        private short deptNo;
        public short DeptNo
        {
            set
            {
                if(value <= 0)
                {
                    Console.WriteLine("Invalid Dept No");
                }
                else
                    deptNo = value;
            }
            get
            {
                return deptNo;
            }
        }

    }

    class Manager : Employee
    {
        public Manager(string name = null, decimal basic = 0, short deptNo = 0, string designation = null):base(name,basic,deptNo)
        {
            this.Designation = designation;
        }
        public override decimal Basic
        {
            set
            {
                basic = value;
            }
            get
            {
                return Basic;
            }
        }

        private string designation;
        public string Designation
        {
            set
            {
                if(value != null)
                {
                    designation = value;
                }
                else
                {
                    Console.WriteLine("Desination can't be blank");
                }
            }
            get
            {
                return designation;
            }
        }

        public override decimal CalcNetSalary()
        {
            Console.WriteLine("This is Manager net salary method");
            return 10000;
        }
    }

    class GeneralManager : Manager
    {
        public GeneralManager(string name = null, decimal basic = 0, short deptNo = 0, string designation = null, string perks = null):base(name,basic,deptNo,designation)
        {
                
        }
        private string perks;
        public string Perks
        {
            set
            {
                perks = value;
            }
            get
            {
                return perks;
            }
        }

        public override decimal CalcNetSalary()
        {
            Console.WriteLine("This is General Manager net salary method");
            return 10000;
        }


    }

    class CEO : Employee
    {
        public CEO(string name = null, decimal basic = 0, short deptNo = 0):base(name,basic,deptNo)
        {
                
        }
        public override decimal Basic
        {
            get
            {
                return basic;
            }
            set
            {
                basic = value;
            }
        }
        public override sealed decimal CalcNetSalary()
        {
            Console.WriteLine("This is CEO salary method");
            return 1010101010;
        }
    }


}
