1.	Install Java Runtime Environment 1.8
Enter the download address of the official website JDK1.8
The following interface appears
 
Select [Accept License Agreement] first to agree to the installation and use agreement;
Select windows x64 (i.e. 64 bit operating system), and click download; Wait for the download to complete.
Download and install by default.
Note: remember your installation path when installing.
For example, my installation path here is: C: \ program files \ Java \ jdk1.8.0«
Then find “环境变量“
 
New Java home system variable
Variable name: java_home,
variable value: C: \ program files \ Java \ jdk1.8.0_ (fill in the installation path you choose here.)
 
New classpath variable
Variable name: classpath, variable value:.;% java_home% \ lib;% java_home% \lib \ tools.jar (note the first point)
 
Configure system environment variable path
Double click Path > New > add% Java > Home% \ bin > to move this line up to the top of the variable
 
 
After all environment variables are configured, you can apply environment variables.
 
2．建立数据库
安装数据库服务器
 
配置环境变量
 
 
建立数据库并导入数据
 
2.	配置tomcat
打开idea，打开项目 
运行tomcat 
点configure配置路径 
Run tomcat即可运行项目
