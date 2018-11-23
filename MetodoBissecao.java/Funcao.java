package calculonumericoFinalmente;

import java.util.Scanner;

public class Funcao 
{
    private int nite, ite, verificar; //nite = numeros de iterações em cada teste, ite = interações que o usuario informou, verificar = opção escolhida de parada 1-erro, 2-iterações, 3-ambos
    private double a, b, xmedio, xant, erro; //a = primeiro intervalo, b = segundo intervalo, xmedio = a+b/2, xant = o x da iteração anterior, erro = erro;
    
    Scanner input = new Scanner(System.in);
    
    //Funcao que retorna o valor da função passando um valor
    public double funcaoPrincipal (double d)
    {
        return (25*(d*d)) + Math.log(d) - 0.00015;
    }
    
    public double funcaoErroAbs(double x2, double x1)
    {
        return Math.abs( x2-x1 );
    }
   
    //Funcao que retorna o valor do erro
    public double funcaoErro(double x2, double x1) 
    {
        return Math.abs( (x2-x1)/x2 );
    }
    
    public double funcaoMinIte(double a, double b, double erro)
    {        
        return (( Math.log(Math.abs(a-b)) - Math.log(erro) )/ Math.log(2));        
    }
    
    //Funcao que vai preencher os intervalos e condições de parada;
    public void preencherDados()
    {      
        double aux=funcaoPrincipal(0);
        
        //Preenche o intervalo e testa se tem raizes;
        System.out.println("==============================================");        
        System.out.println("Informe o invervalo desejado.");        
        System.out.print("1 valor: ");
        this.a = input.nextDouble();
        System.out.print("2 valor: ");
        this.b = input.nextDouble();   
        while( (this.funcaoPrincipal(a) * this.funcaoPrincipal(b) > 0) || a<=0 || b<=0)
        {       
            System.out.println("O valor informado não possuei raizes, tente novamente.");        
            System.out.print("1 valor: ");
            this.a = input.nextDouble();
            System.out.print("2 valor: ");
            this.b = input.nextDouble();             
        }
        
        //Preenche a condição de parada;
        System.out.println("==============================================");
        System.out.println("Qual a condição de parada?");
        System.out.println("1. Por erro");
        System.out.println("2. Por iterações");
        System.out.println("3. Por iterações ou erro");
        System.out.print("Opção: ");
        switch(input.nextInt())
        {
            case 1: System.out.print("Informe o erro desejado: ");
                    this.erro = input.nextDouble();
                    this.verificar=1;
                    System.out.println("==============================================");
                    break;
                    
            case 2: System.out.print("Informe a quantidade de iterações desejada: ");
                    this.ite = input.nextInt();
                    this.verificar=2;
                    System.out.println("==============================================");
                    break;
                    
            case 3: System.out.print("Informe o erro desejado: ");
                    this.erro = input.nextDouble();                
                    System.out.print("Informe a quantidade de iterações desejada: ");
                    this.ite = input.nextInt();
                    this.verificar=3;
                    System.out.println("==============================================");
                    break;
        }     
    }
    
    public void metodoBis()
    {
        
        double backupA=this.a, backupB=this.b;
        
        switch(verificar)
        {
            case 1:
                
                nite=0;              
                do
                {
                    nite++;
                    xant=this.xmedio;
                    this.xmedio = (this.a+this.b)/2; 
                    if(this.funcaoPrincipal(a)*this.funcaoPrincipal(this.xmedio)<0)
                    {                     
                        this.b=xmedio;
                        if(nite==1)                        
                            this.xant=a;                     
                    }
                    else
                    {
                        this.a=xmedio;
                        if(nite==1)
                            this.xant=b;
                    }                     
                    System.out.printf("Interação %d: Raiz=%.20f\n", nite, xmedio);
                }
                while(erro <= this.funcaoErro(xmedio,xant));
                
                System.out.println("==============================================");                 
                System.out.printf("Para o Erro Relativo e Absoluto igual a %f serão realiadas no mínimo %d iterações para o Relativo e %.0f para o Absoluto.\n", this.erro, this.nite, Math.ceil(funcaoMinIte(backupA, backupB, this.erro)));
                System.out.printf("Intervalo: [ %.2f , %.2f ]\n", backupA, backupB);
                System.out.printf("Raiz: %.20f", this.xmedio);  
                System.out.printf("\nf(raiz): %f", funcaoPrincipal(this.xmedio));
                System.out.printf("\nErro Relativo: %.20f", this.funcaoErro(xmedio,xant));
                System.out.printf("\nErro Absoluto: %.20f", this.funcaoErroAbs(xmedio,xant));                
                System.out.printf("\nErro Percentual: %.20f%%", this.funcaoErro(xmedio,xant)*100);
                System.out.printf("\nNumero de iterações realizadas: %d\n", this.nite);
                break;                
                
            case 2:
                
                nite=0;
                
                do
                {
                    nite++;
                    xant=this.xmedio;
                    this.xmedio = (this.a+this.b)/2; 
                    if(this.funcaoPrincipal(a)*this.funcaoPrincipal(this.xmedio)<0)
                    {                     
                        this.b=xmedio;
                        if(nite==1)                        
                            this.xant=a;                     
                    }
                    else
                    {
                        this.a=xmedio;
                        if(nite==1)
                            this.xant=b;
                    }
                    System.out.printf("Interação %d: Raiz=%.20f\n", nite, xmedio);
                }
                while(this.nite < this.ite);
                
                System.out.println("==============================================");
                System.out.printf("Intervalo: [ %.2f , %.2f ]\n", backupA, backupB);              
                System.out.printf("Raiz: %.20f", this.xmedio);  
                System.out.printf("\nf(raiz): %f", funcaoPrincipal(this.xmedio));
                System.out.printf("\nErro Relativo: %.20f", this.funcaoErro(xmedio,xant));
                System.out.printf("\nErro Absoluto: %.20f", this.funcaoErroAbs(xmedio,xant));                
                System.out.printf("\nErro Percentual: %.20f%%", this.funcaoErro(xmedio,xant)*100);
                System.out.printf("\nNumero de iterações realizadas: %d\n", this.nite);
                break;
                
            case 3:
               
                nite=0;
                
                do
                {
                    nite++;
                    xant=this.xmedio;
                    this.xmedio = (this.a+this.b)/2; 
                    if(this.funcaoPrincipal(a)*this.funcaoPrincipal(this.xmedio)<0)
                    {                     
                        this.b=xmedio;
                        if(nite==1)                        
                            this.xant=a;                     
                    }
                    else
                    {
                        this.a=xmedio;
                        if(nite==1)
                            this.xant=b;
                    }
                    System.out.printf("Interação %d: Raiz=%.20f\n", nite, xmedio);
                }
                while( (this.nite < this.ite) && erro < this.funcaoErro(xmedio,xant) );
                
                System.out.println("=============================================="); 
                System.out.printf("Para o Erro Relativo e Absoluto igual a %f serão realiadas no mínimo %d iterações para o Relativo e %.0f para o Absoluto.\n", this.erro, this.nite, Math.ceil(funcaoMinIte(backupA, backupB, this.erro)));
                System.out.printf("Intervalo: [ %.2f , %.2f ]\n", backupA, backupB);              
                System.out.printf("Raiz: %.20f", this.xmedio);  
                System.out.printf("\nf(raiz): %f", funcaoPrincipal(this.xmedio));
                System.out.printf("\nErro Relativo: %.20f", this.funcaoErro(xmedio,xant));
                System.out.printf("\nErro Absoluto: %.20f", this.funcaoErroAbs(xmedio,xant));
                System.out.printf("\nErro Percentual: %.20f%%", this.funcaoErro(xmedio,xant)*100);
                System.out.printf("\nNumero de iterações realizadas: %d\n", this.nite);
                break;                
        }        
    }
    
    public static void main(String[] args) 
    {
        Funcao f = new Funcao();        
        f.preencherDados();   
        f.metodoBis();
    }
}

