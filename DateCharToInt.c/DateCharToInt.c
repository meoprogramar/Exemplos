#include <windows.h>
#include <stdio.h>

int datat(char* x, int *dd, int *mm, int *yy)
{
    char numeros[10]={'0','1','2','3','4','5','6','7','8','9'};
    int i, j, v[6], count=0, dia, dia2, mes, mes2, ano, ano2;

    for(i=0;i<11;i++)
    {
        if(i!=2 && i!=5)
        {
            for(j=0;j<11;j++)
            {
                if(x[i]==numeros[j])
                {
                    v[count]=j;
                    count++;
                }
            }
        }
    }
    for(i=0;i<6;i++)
    {
        if(i%2==0)
        {
            switch(i)
            {
                case 0: mes=(v[i]*10); break;
                case 2: dia=(v[i]*10); break;
                case 4: ano=(v[i]*10); break;
            }
        }
        if(i%2==1)
        {
            switch(i)
            {
                case 1: mes2=v[i]; break;
                case 3: dia2=v[i]; break;
                case 5: ano2=v[i]; break;
            }
        }
    }
    *dd=dia+dia2;
    *mm=mes+mes2;
    *yy=ano+ano2;
}


main()
{
    int dia,mes,ano;
    char data[9];
    _strdate(data);
    datat(data, &dia, &mes, &ano);
    printf("Dia: %d, Mes: %d, Ano: %d", dia, mes, ano);
}
