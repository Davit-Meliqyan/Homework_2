package homework_19;

import homework_19.task_1.Animal;
import homework_19.task_1.Dog;
import homework_19.task_2.Accounting;
import homework_19.task_2.FinancialAccount;
import homework_19.task_2.TaxAccounting;
import homework_19.task_3.ItCompany;
import homework_19.task_3.Marketing;
import homework_19.task_3.SEO;
import homework_19.task_3.SMM;


public class Test {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.voice();
        animal.eat();

        dog.voice();
        dog.eat();

        Accounting accounting = new Accounting();
        FinancialAccount financialAccount = new FinancialAccount();
        TaxAccounting taxAccounting = new  TaxAccounting();

        accounting.account();
        financialAccount.account();
        taxAccounting.account();

        ItCompany itCompany = new ItCompany();
        homework_19.task_3.Accounting accounting1 = new homework_19.task_3.Accounting();
        homework_19.task_3.FinancialAccount financialAccount1 = new homework_19.task_3.FinancialAccount();
        homework_19.task_3.TaxAccounting taxAccounting1 = new homework_19.task_3.TaxAccounting();
        Marketing marketing = new Marketing();
        SEO seo = new SEO();
        SMM smm = new SMM();

        itCompany.account();
        accounting1.account();
        financialAccount1.account();
        taxAccounting1.account();
        marketing.marketing();
        seo.marketing();
        smm.marketing();

    }
}
