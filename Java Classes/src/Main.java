//Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
// Создать массив объектов. Вывести: a) список пациентов, имеющих данный диагноз;
//b) список пациентов, номер медицинской карты которых находится в заданном интервале.

public class Main {
    public static void main(String[] args) {

        Patient oleg = new Patient();
        oleg.setId(11);
        oleg.setSurname("Соболев");
        oleg.setFirstName("Олег");
        oleg.setSecondName("Александрович");
        oleg.setAddress("Улица мельникова 5");
        oleg.setMedCardNumber(1111);
        oleg.setPhoneNumber(375222);
        oleg.setDiagnosis("Гастрит");

        Patient alex = new Patient();
        alex.setId(12);
        alex.setSurname("Свиридов");
        alex.setFirstName("Александр");
        alex.setSecondName("Артемович");
        alex.setAddress("Улица Аэродромная 51");
        alex.setMedCardNumber(2000);
        alex.setPhoneNumber(375467);
        alex.setDiagnosis("ОКР");

        Patient maria = new Patient();
        maria.setId(13);
        maria.setSurname("Позняк");
        maria.setFirstName("Мария");
        maria.setSecondName("Сергеевна");
        maria.setAddress("Улица Якуба Коласа 9");
        maria.setMedCardNumber(9220);
        maria.setPhoneNumber(375567);
        maria.setDiagnosis("Гастрит");

        Patient viktor = new Patient();
        viktor.setId(14);
        viktor.setSurname("Картеников");
        viktor.setFirstName("Виктор");
        viktor.setSecondName("Иоганович");
        viktor.setAddress("Улица Притыцкого 10");
        viktor.setMedCardNumber(3999);
        viktor.setPhoneNumber(379647);
        viktor.setDiagnosis("ОКР");

        Patient[] patients = new Patient[4];
        patients[0] = oleg;
        patients[1] = alex;
        patients[2] = maria;
        patients[3] = viktor;

            for(int i = 0; i < patients.length; i++) {
                if (patients[i].getDiagnosis() == "Гастрит") {
                    System.out.println(patients[i]);
                }
            } // Вывод пациентов с диагнозом "Гастрит"
            System.out.println();

            for(int i = 0; i < patients.length; i++) {
                if (patients[i].getMedCardNumber() <= 4000 && patients[i].getMedCardNumber() >= 2000) {
                    System.out.println(patients[i] + ". Номер медкарты - " + patients[i].getMedCardNumber());
                }
            } // Вывод пациентов с номером медкарты в интервале от 2000 до 4000
    }
}



