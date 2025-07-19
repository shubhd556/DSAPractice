    #include <iostream>
    using namespace std;
    
    //Define Hello World Function
    void showHelloWorld()
    {
      cout<<"Hello World"<<endl;
      cout<<"Shubham Dudhal, Pune University Passout"<<endl;
    }

    int main() 
    {
    //Call function hello world
    showHelloWorld();
    int sum = 0;
    int counter = 1;
    
    //while loop
    while(counter<=10)
    {
      sum=sum+counter;
      counter=counter+1;
    }
    
    cout<<"Sum [1,10] = "<<sum<<endl;
    
    sum=0;
    
    //for loop
    for (int counter =1;counter<=10;counter++)
    {
      sum=sum+counter;
    }
    
    cout<<"Sum [1,10] = "<<sum<<endl;
    
    int n;
    int total=0;
    for(int counter=0;counter<5;counter++)
    {
      cin>>n;
      total+=n;
    }
    
    cout<<"Total : "<<total<<endl;
    //Step 4 
    
    for(int rowNo=1;rowNo<=5;rowNo++)
    {
      for (int j=0;j<rowNo;j++)
      {
        cout<<j;
      }
      cout<<endl;
    }
        int arr []={1,2,3,4,5,6};
    
    for (int i=0;i<6;i++)
    {
      cout<<arr[i]<<endl;
    }
    
    for (int i=0;i<6;i++)
    {
      arr[i]=arr[i]+100;
      cout<<arr[i]<<endl;
    }
    int sum = 0;
    for (int i=0;i<6;i++)
    {
      cin>>arr[i];
      sum+=arr[i];
    }
    
    cout<<sum<<endl;


    // Step 6 ::
    bool isPrime(int n)
    {
      if(n<2) return false;
      for(int i=2;i<n;i++)
      {
        if(n%i==0)
        {
          return false;
        }
      }
      return true;
    }
    int sum(int a, int b)
    {
      int ans = a+b;
      return ans;
    }
    
    int sum(int a, int b, int c)
    {
      int ans = sum(a,b);
      ans = sum(ans,c);
      return ans;

    }
    int main() 
    {
    //Call function hello world
    showHelloWorld();
    cout<<sum(5,10)<<endl;
    cout<<sum(5,10,15)<<endl;
    for(int i=2;i<=100;i++)
    {
      if(isPrime(i))
      {
        cout<<i<<endl;
      }
    }
    // Recurusion 
        
    void RevPrint(int n)
    {
      if(n<=0)
      {
        return;
      }
      if(n%2==0)
      {
        cout<<n<<" ";
      }
       RevPrint(n-1);
    }

    // Search Linear and Binay : 
        int linearSearch(int arr[],int n,int target)
    {
      for(int i=0;i<n;i++)
      {
        if(arr[i]==target)
        {
          return i;
        }
      }
      return -1;
    }
    
    int binarySearch(int arr[],int n,int target)
    {
      int l = 0;
      int h = n-1;
      while(l<=h)
      {
        int middle = (l+h)/2;
        if(arr[middle]==target)
        {
          return middle;
        }
        else if(arr[middle]>target)
        {
          h = middle-l;
        }
        else
        {
          l=middle+l;
        }
      }
      return -1;
    }

    //Insertion Sort : 
        void insertionSort(int arr[], int n) {
    for (int i = 1; i < n; i++) {
        int key = arr[i]; 
        int j = i - 1;   
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key; 
    }

      void insertionSort(int arr[], int n) {
    for (int i = 1; i < n; i++) {
        int key = arr[i]; 
        int j = i - 1;   
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key; 
    }
}

void bubbleSort(int arr[], int n) {
    // Outer loop for passes
    for (int i = 0; i < n - 1; i++) {
        // Inner loop for comparisons and swaps within each pass
        for (int j = 0; j < n - i - 1; j++) {
            // Compare adjacent elements
            if (arr[j] > arr[j + 1]) {
                // Swap if elements are in the wrong order
                std::swap(arr[j], arr[j + 1]);
            }
        }
    }
}

///String operations : 
  char str1[]= "Hello World";
  char str2[]={'C','+','+','\0'};
  cout<<str2<<endl<<"###"<<endl;
  
  char temp[100];
  strcpy(temp,str1);
  cout<<temp<<endl;
  cout<<strlen(temp)<<endl;
  
  strcat(temp,str2);
  cout<<temp<<endl;
  cout<<strlen(temp)<<endl;

    string s ="Hello World";
    cout<<"Length : "<<s.size()<<endl;
    string a = "C++";
    s=s+a;
    cout<<"Updated : "<<s<<endl;
    cout<<(a==a)<<endl;


    
    return 0;
    
    }