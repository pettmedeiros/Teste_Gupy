package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model_entities.Contract;
import model_entities.Installment;
import model_services.ContractService;
import model_services.PaypalService;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        sc.nextLine(); // Consome a nova linha após nextInt()

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt); // Agora deve funcionar corretamente

        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();
        
        Contract obj = new Contract(number, date, totalValue);
        
        System.out.print("Entre com o numero de parcelas: ");
        int n = sc.nextInt();
        
        ContractService service = new ContractService(new PaypalService());
        
        service.processContract(obj, n);
        
        System.out.println("PARCELAS: ");
        
        for (Installment installment : obj.getInstallment()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
