#include <iostream>
#define ll long long int
using namespace std;

const ll Mod = 100000007;

ll helper(ll num)
{

    ll count = 0;
    while (num > 1)
    {
        count++;
        num = num / 2;
    }
    return count;
}

int main()
{

    ll a, b;
    cin >> a >> b;
    ll countOf2s = 0, countOf5s = 0, count = 0;
    string str;
    for (ll i = a + 1; i <= b; i++)
    {
        str = to_string(i);
        if (str.size() == 1)
            continue;
        for (int i = str.size() - 1; i >= 0; i--)
        {

            if (str[i] == '0')
            {
                count = 1;
                break;
            }
            else if ((str[i] - '0') % 2 == 0)
                countOf2s = (countOf2s + helper(str[i] - '0') + Mod) % Mod;

            else if (str[i] == '2')
                countOf2s = (countOf2s + 1 + Mod) % Mod;
            else if (str[i] == '5')
                countOf5s = (countOf5s + 1 + Mod) % Mod;
        }
    }
    cout << min(countOf2s, countOf5s) + count << endl;
}