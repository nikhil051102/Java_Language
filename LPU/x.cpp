#include <iostream>
#include<vector>
using namespace std;

template <class T>
void Display(vector<T> v)
{
    for (int i = 0; i < v.size(); i++)
    {
        cout<<v[i]<<" ";
    }
    cout<<endl;
}

int main()
{
    vector<int> v1;
    int n, element;
    cout<<"Number of Elements : ";
    cin>>n;

    for (int i = 0; i < n; i++)
    {
        cout<<"Element : ";
        cin>>element;
        v1.push_back(element);
    }
    
    Display(v1);

    vector<int> :: iterator iter = v1.begin();
    v1.insert(iter, 2, 300);
    Display(v1);
    v1.emplace_back(30);
    Display(v1);
    return 0;
}