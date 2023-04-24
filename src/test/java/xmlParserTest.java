
import org.junit.jupiter.api.Test;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;


public class xmlParserTest {

    public static void calculateGen(String fileName) throws Exception {
// Блок генерации постоянных значений типа Int
        // Методом calculate.getRandInt генерируем число, в параметрах передаем разряд числа(количество символов)
        // Метод changeLineText.changeWord изменяет указанную часть строки на сгенерированное значение
        String docID = Calculate.getRandInt(7);
        changeLineTest.changeWord("###docId", docID, fileName);
        String patientID = Calculate.getRandInt(7);
        changeLineTest.changeWord("###patientId", patientID, fileName);
        String patientSnils = Calculate.getRandInt(11);
        changeLineTest.changeWord("###patientSNILS", patientSnils, fileName);
        String patientDocSer = Calculate.getRandInt(4);
        changeLineTest.changeWord("###patientDocSer", patientDocSer, fileName);
        String patientDocNum = Calculate.getRandInt(6);
        changeLineTest.changeWord("###patientDocNum", patientDocNum, fileName);
        String patientOmsNum = Calculate.getRandInt(11);
        changeLineTest.changeWord("###patientOmsNum", patientOmsNum, fileName);
        String patientRegion = Calculate.getRandInt(2);
        changeLineTest.changeWord("###patientRegion", patientRegion, fileName);
        String patientAddrIndex = Calculate.getRandInt(6);
        changeLineTest.changeWord("###patientAddrIndex", patientAddrIndex, fileName);
        String medOrgIndex = Calculate.getRandInt(6);
        changeLineTest.changeWord("###medOrgIndex", medOrgIndex, fileName);
        String providerOGRN = "10" + Calculate.getRandInt(11);
        changeLineTest.changeWord("###providerOGRN", providerOGRN, fileName);

// Блок генерации кодов и значений к ним
        //В переменную xxxxxxxArgNum помещаем количество кодов
        //В переменную xxxxxxxArg помещаем аргументы кодов, если они отличаются от целых значений или же у них последовательность
        //В переменной xxxxxxxArg первое значение всегда должно быть пустым, т.к. оно начинается с 0 и никогда не будет выбрано
        //Методом Calculate.getEnum методом генерации выбираем уникальное число, это число будет индексом для массивов кодов и значений
        //Методом Calculate.getEnumValue выбираем значение по сгенерированному числу(передаем число и масив со значением)
        //Метод changeLineText.changeWord изменяет указанную часть строки на сгенерированное значение

//******************************************************************************
        String[] confCodeArgNum = {"1", "2", "3"};
        String[] confCodeArg = {"", "N", "R", "V"};
        String confCodeNum = Calculate.getEnum(confCodeArgNum);
        String confCode = Calculate.getEnumValue(confCodeNum, confCodeArg);
        changeLineTest.changeWord("###confCode", confCode, fileName);

        String[] confCodeValue = {"", "Обычный", "Ограниченный", "Крайне ограниченный"};
        String confValue = Calculate.getEnumValue(confCodeNum, confCodeValue);
        changeLineTest.changeWord("###confValue", confValue, fileName);

//******************************************************************************
        String[] patientDocCoreArg = {"1", "2", "3", "4", "5", "6", "42"};
        String patientDocCode = Calculate.getEnum(patientDocCoreArg);


        String[] patientDocCodeValueArg = {"",
                "Паспорт гражданина Российской Федерации",
                "Паспорт гражданина Российской Федерации, являющийся основным документом, удостоверяющим личность гражданина Российской Федерации за пределами территории Российской Федерации, в том числе содержащий электронный носитель информации",
                "Заграничный паспорт гражданина Российской Федерации",
                "Дипломатический паспорт",
                "Служебный паспорт гражданина Российской Федерации",
                "Временное удостоверение личности гражданина Российской Федерации",
                "Свидетельство о рождении"};

        String patientDocValue = Calculate.getEnumValueDoc(patientDocCode, patientDocCodeValueArg);
        changeLineTest.changeWord("###patientDocValue", patientDocValue, fileName);
        changeLineTest.changeWord("###patientDocCode", patientDocCode, fileName);

//******************************************************************************

        String[] patientPolicyTypeCodeArr = {"1", "2", "3", "4"};
        String patientPolicyTypeCode = Calculate.getEnum(patientPolicyTypeCodeArr);

        changeLineTest.changeWord("###patientPolicyTypeCode", patientPolicyTypeCode, fileName);

        String[] patientPolicyTypeValueArr = {"",
                "Полис ОМС старого образца",
                "Полис ОМС единого образца, бессрочный",
                "Полис ОМС единого образца, со сроком действия",
                "Временное свидетельство"};
        String patientPolicyTypeValue = Calculate.getEnumValue(patientPolicyTypeCode, patientPolicyTypeValueArr);

        changeLineTest.changeWord("###patientPolicyTypeValue", patientPolicyTypeValue, fileName);

//******************************************************************************

        String[] medServiceFormCodeArr = {"1", "2", "3"};
        String medServiceFormCode = Calculate.getEnum(medServiceFormCodeArr);
        String[] medServiceFormValueArr = {"", "плановая", "экстренная", "неотложная"};

        String medServiceFormValue = Calculate.getEnumValue(medServiceFormCode, medServiceFormValueArr);

        changeLineTest.changeWord("###medServiceFormCode", medServiceFormCode, fileName);
        changeLineTest.changeWord("###medServiceFormValue", medServiceFormValue, fileName);

//******************************************************************************

        String[] medServiceCondCodeArr = {"1", "2", "3", "4"};
        String medServiceCondCode = Calculate.getEnum(medServiceCondCodeArr);
        String[] medServiceCondValueArr = {"",
                "Стационарно",
                "Амбулаторно, в том числе на дому при вызове медицинского работника",
                "В дневном стационаре",
                "Вне медицинской организации"};
        String medServiceCondValue = Calculate.getEnumValue(medServiceCondCode, medServiceCondValueArr);
        changeLineTest.changeWord("###medServiceCondCode", medServiceCondCode, fileName);
        changeLineTest.changeWord("###medServiceCondValue", medServiceCondValue, fileName);

//******************************************************************************

        String[] medCardTypeCodeArr = {"1", "2", "3"};
        String medCardTypeCode = Calculate.getEnum(medCardTypeCodeArr);
        String[] medCardTypeValueArr = {"",
                "Амбулаторная медицинская карта",
                "Стационарная медицинская карта",
                "Иная медицинская карта"};
        String medCardTypeValue = Calculate.getEnumValue(medCardTypeCode, medCardTypeValueArr);

        changeLineTest.changeWord("###medCardTypeCode", medCardTypeCode, fileName);
        changeLineTest.changeWord("###medCardTypeValue", medCardTypeValue, fileName);

//******************************************************************************

        String[] VisitCodeArr = {"1", "2"};

        String VisitCode = Calculate.getEnum(VisitCodeArr);

        String[] VisitValueArr = {"",
                "Первичный",
                "Вторичный"};
        String VisitValue = Calculate.getEnumValue(VisitCode, VisitValueArr);

        changeLineTest.changeWord("###VisitCode", VisitCode, fileName);
        changeLineTest.changeWord("###VisitValue", VisitValue, fileName);

//******************************************************************************

        String[] diseaseCodeArg = {"",
                "A00", "A01", "A02", "A03", "A20", "A21", "A22",
                "A23", "A25", "A26", "A27", "A36", "A37", "A38",
                "A42", "A43", "A44", "B67", "B68", "B69", "B73",
                "B72", "B74", "E06", "S60.0", "S60.1", "S60.2", "S63.0",
                "S63.1", "S63.2", "S50.0", "S50.1", "S50.7", "S50.8",
                "S50.9", "S80.0", "S80.1", "S80.7", "S93.0", "S93.1", "S93.2", "S93.3"
        };
        String[] diseaseCodeArgNum = {
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
                "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42"
        };
        String[] diseaseCodeValue = {"",
                "Холера",
                "Тиф и паратиф",
                "Другие сальмонеллезные инфекции",
                "Шигеллез",
                "Чума",
                "Туляремия",
                "Сибирская язва",
                "Бруцеллез",
                "Лихорадка от укуса бывшей",
                "Эризипелоид",
                "Лептоспироз",
                "Дифтерия",
                "Коклюш",
                "Скарлатина",
                "Актиномикоз",
                "Нокардиоз",
                "Бартонеллез",
                "Эхинококкоз",
                "Тениоз",
                "Цистицеркоз",
                "Онхоцеркоз",
                "Дракункулез",
                "Филяриатоз",
                "Тиреоидит",
                "Ушиб пальца (ев) кисти без повреждения ногтевой пластинки",
                "Ушиб пальца (ев) кисти с повреждением ногтевой пластинки",
                "Ушиб других частей запястья и кисти",
                "Вывих запястья",
                "Вывих пальца кисти",
                "Множественные вывихи пальцев кисти",
                "Ушиб локтя",
                "Ушиб другой и неуточненной части предплечья",
                "Множественные поверхностные травмы предплечья",
                "Другие поверхностные травмы предплечья",
                "Поверхностная травма предплечья неуточненная",
                "Ушиб коленного сустава",
                "Ушиб другой и неуточненной части голени",
                "Множественные поверхностные травмы голени'",
                "Вывих голеностопного сустава",
                "Вывих пальца (ев) стопы",
                "Разрыв связок на уровне голеностопного сустава и стопы",
                "Вывих другой и неуточненной части стопы"
        };

        String diseaseCodeNum = Calculate.getEnum(diseaseCodeArgNum);
        String diseaseCode = Calculate.getEnumValue(diseaseCodeNum, diseaseCodeArg);
        changeLineTest.changeWord("###diseaseCode", diseaseCode, fileName);

        String diseaseValue = Calculate.getEnumValue(diseaseCodeNum, diseaseCodeValue);
        changeLineTest.changeWord("###diseaseValue", diseaseValue, fileName);

//******************************************************************************

        String[] resultCodeArr = {"1", "2", "3"};
        String resultCode = Calculate.getEnum(resultCodeArr);
        String[] resultValueArr = {"",
                "Выздоровление",
                "Улучшение",
                "Без изменения"};
        String resultValue = Calculate.getEnumValue(resultCode, resultValueArr);

        changeLineTest.changeWord("###resultCode", resultCode, fileName);
        changeLineTest.changeWord("###resultValue", resultValue, fileName);

//******************************************************************************

        String[] characterDiseaseCodeArr = {"1", "2", "3"};
        String characterDiseaseCode = Calculate.getEnum(characterDiseaseCodeArr);
        String[] characterDiseaseValueArr = {"",
                "Впервые в жизни установленное хроническое",
                "Ранее установленное хроническое",
                "Острое"};
        String characterDiseaseValue = Calculate.getEnumValue(characterDiseaseCode, characterDiseaseValueArr);

        changeLineTest.changeWord("###characterDiseaseCode", characterDiseaseCode, fileName);
        changeLineTest.changeWord("###characterDiseaseValue", characterDiseaseValue, fileName);

//******************************************************************************

        String[] reasonCodeArrNum = {"1", "2"};
        String[] reasonCodeArr = {"", "W06", "T78.4"};

        String reasonCodeNum = Calculate.getEnum(reasonCodeArrNum);
        String reasonCode = Calculate.getEnumValue(reasonCodeNum, reasonCodeArr);

        String[] reasonValueArr = {"",
                "Падение, связанное с кроватью",
                "Аллергия неуточненная"};
        String reasonValue = Calculate.getEnumValue(reasonCodeNum, reasonValueArr);

        changeLineTest.changeWord("###reasonCode", reasonCode, fileName);
        changeLineTest.changeWord("###reasonValue", reasonValue, fileName);

//******************************************************************************

        String[] doctorPositionCodeArrNum = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
                "20", "21", "22", "23", "24", "25", "26", "27", "28"};
        String[] doctorPositionCodeArr = {"", "13", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "27", "28", "33", "34", "39", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55"};
        String doctorPositionCodeNum = Calculate.getEnum(doctorPositionCodeArrNum);
        String doctorPositionCode = Calculate.getEnumValue(doctorPositionCodeNum, doctorPositionCodeArr);

        String[] doctorPositionValueArr = {"",
                "врач-акушер-гинеколог",
                "врач-аллерголог-иммунолог",
                "врач-анестезиолог-реаниматолог",
                "врач-бактериолог",
                "врач-вирусолог",
                "врач-гастроэнтеролог",
                "врач-гематолог",
                "врач-генетик",
                "врач-гериатр",
                "врач-дезинфектолог",
                "врач-дерматовенеролог",
                "врач - детский кардиолог",
                "врач - детский онколог-гематолог",
                "врач - детский хирург",
                "врач-инфекционист",
                "врач-кардиолог",
                "врач-косметолог",
                "врач-невролог",
                "врач-нейрохирург",
                "врач-неонатолог",
                "врач-нефролог",
                "врач общей практики (семейный врач)",
                "врач-онколог",
                "врач-ортодонт",
                "врач-остеопат",
                "врач-оториноларинголог",
                "врач-офтальмолог",
                "врач-офтальмолог-протезист"};
        String doctorPositionValue = Calculate.getEnumValue(doctorPositionCodeNum, doctorPositionValueArr);

        changeLineTest.changeWord("###doctorPositionCode", doctorPositionCode, fileName);
        changeLineTest.changeWord("###doctorPositionValue", doctorPositionValue, fileName);

//******************************************************************************

        String[] kindDeathCertificateCodeArr = {"1", "2", "3", "4"};
        String kindDeathCertificateCode = Calculate.getEnum(kindDeathCertificateCodeArr);
        String[] kindDeathCertificateValueArr = {"",
                "Окончательное",
                "Предварительное",
                "Взамен предварительного",
                "Взамен окончательного"};
        String kindDeathCertificateValue = Calculate.getEnumValue(kindDeathCertificateCode, kindDeathCertificateValueArr);

        changeLineTest.changeWord("###kindDeathCertificateCode", kindDeathCertificateCode, fileName);
        changeLineTest.changeWord("###kindDeathCertificateValue", kindDeathCertificateValue, fileName);

//******************************************************************************

        String[] kindDeathPlaceCodeArr = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
        String kindDeathPlaceCode = Calculate.getEnum(kindDeathPlaceCodeArr);
        String[] kindDeathPlaceValueArr = {"",
                "на месте происшествия",
                "в машине скорой помощи",
                "в стационаре",
                "дома",
                "в другом месте",
                "неизвестно",
                "в образовательной организации",
                "вне стационара",
                "в ЛПУ",
                "в учреждении",
                "на улице"};
        String kindDeathPlaceValue = Calculate.getEnumValue(kindDeathPlaceCode, kindDeathPlaceValueArr);

        changeLineTest.changeWord("###kindDeathPlaceCode", kindDeathPlaceCode, fileName);
        changeLineTest.changeWord("###kindDeathPlaceValue", kindDeathPlaceValue, fileName);

//******************************************************************************

        String[] maritalStatusCodeArr = {"1", "2", "3", "4", "5"};
        String maritalStatusCode = Calculate.getEnum(maritalStatusCodeArr);
        String[] maritalStatusValueArr = {"",
                "состоит в зарегистрированном браке",
                "не состоит в зарегистрированном браке",
                "неизвестно",
                "состоял(а) в зарегистрированном браке",
                "не состоял(а) в зарегистрированном браке"};
        String maritalStatusValue = Calculate.getEnumValue(maritalStatusCode, maritalStatusValueArr);

        changeLineTest.changeWord("###maritalStatusCode", maritalStatusCode, fileName);
        changeLineTest.changeWord("###maritalStatusValue", maritalStatusValue, fileName);

//******************************************************************************

        String[] educationCodeArr = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
        String educationCode = Calculate.getEnum(educationCodeArr);
        String[] educationValueArr = {"",
                "профессиональное: высшее",
                "профессиональное: неполное высшее",
                "профессиональное: среднее профессиональное",
                "профессиональное: начальное",
                "общее: среднее",
                "общее: основное",
                "общее: начальное",
                "не имеет образования",
                "неизвестно",
                "общее: дошкольное",
                "не имеет начального образования"};
        String educationValue = Calculate.getEnumValue(educationCode, educationValueArr);

        changeLineTest.changeWord("###educationCode", educationCode, fileName);
        changeLineTest.changeWord("###educationValue", educationValue, fileName);

//******************************************************************************

        String[] occupationCodeArrNum = {"1", "2", "3", "4", "5", "6", "7", "8"};
        String[] occupationCodeArr = {"", "3", "4", "5", "6", "7", "8", "9", "10"};

        String occupationCodeNum = Calculate.getEnum(occupationCodeArrNum);
        String occupationCode = Calculate.getEnumValue(occupationCodeNum, occupationCodeArr);

        String[] occupationValueArr = {"",
                "Школьник",
                "Студент",
                "Работающий",
                "Военнослужащий",
                "Пенсионер",
                "Неработающий",
                "Лицо без определенного места жительства",
                "Прочие"};
        String occupationValue = Calculate.getEnumValue(occupationCodeNum, occupationValueArr);

        changeLineTest.changeWord("###occupationCode", occupationCode, fileName);
        changeLineTest.changeWord("###occupationValue", occupationValue, fileName);

//******************************************************************************

        String[] deathReasonCodeArrNum = {"1", "2", "3", "4", "5", "6"};
        String[] deathReasonCodeArr = {"", "1", "4", "5", "6", "7", "8"};

        String deathReasonCodeNum = Calculate.getEnum(deathReasonCodeArrNum);
        String deathReasonCode = Calculate.getEnumValue(deathReasonCodeNum, deathReasonCodeArr);

        String[] deathReasonValueArr = {"",
                "от заболевания",
                "убийства",
                "самоубийства",
                "в ходе военных действий",
                "в ходе террористических действий",
                "род смерти не установлен"};
        String deathReasonValue = Calculate.getEnumValue(deathReasonCodeNum, deathReasonValueArr);

        changeLineTest.changeWord("###deathReasonCode", deathReasonCode, fileName);
        changeLineTest.changeWord("###deathReasonValue", deathReasonValue, fileName);

//******************************************************************************

        String[] medWorkerCodeArr = {"1", "2", "3", "4", "5"};
        String medWorkerCode = Calculate.getEnum(medWorkerCodeArr);
        String[] medWorkerValueArr = {"",
                "врач, только установивший смерть",
                "лечащий врач",
                "фельдшер, акушерка",
                "врач-патологоанатом",
                "врач-судебно-медицинский эксперт"};
        String medWorkerValue = Calculate.getEnumValue(medWorkerCode, medWorkerValueArr);

        changeLineTest.changeWord("###medWorkerCode", medWorkerCode, fileName);
        changeLineTest.changeWord("###medWorkerValue", medWorkerValue, fileName);

//******************************************************************************

        String[] deathBaseReasonCodeArr = {"1", "2", "3", "4", "5"};
        String deathBaseReasonCode = Calculate.getEnum(deathBaseReasonCodeArr);
        String[] deathBaseReasonValueArr = {"",
                "осмотр трупа",
                "записи в медицинской документации",
                "собственное предшествовавшее наблюдение",
                "вскрытие",
                "предшествующее наблюдение за пациентом"};
        String deathBaseReasonValue = Calculate.getEnumValue(deathBaseReasonCode, deathBaseReasonValueArr);

        changeLineTest.changeWord("###deathBaseReasonCode", deathBaseReasonCode, fileName);
        changeLineTest.changeWord("###deathBaseReasonValue", deathBaseReasonValue, fileName);

//******************************************************************************

        String[] medServiceKindCodeArrNum = {"1", "2", "3", "4"};
        String[] medServiceKindCodeArr = {"", "1", "2", "3", "9"};

        String medServiceKindCodeNum = Calculate.getEnum(medServiceKindCodeArrNum);
        String medServiceKindCode = Calculate.getEnumValue(medServiceKindCodeNum, medServiceKindCodeArr);

        String[] medServiceKindValueArr = {"",
                "Первичная доврачебная медико-санитарная помощь",
                "Первичная врачебная медико-санитарная помощь",
                "Первичная специализированная медико-санитарная помощь",
                "Скорая специализированная медицинская помощь"
        };
        String medServiceKindValue = Calculate.getEnumValue(medServiceKindCodeNum, medServiceKindValueArr);

        changeLineTest.changeWord("###medServiceKindCode", medServiceKindCode, fileName);
        changeLineTest.changeWord("###medServiceKindValue", medServiceKindValue, fileName);

//******************************************************************************

        String[] LabMaterialCodeArrNum = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
        String[] LabMaterialCodeArr = {"", "132", "108", "208", "177", "256", "178", "179", "180", "191", "137", "135", "133", "330", "301", "134"};

        String LabMaterialCodeNum = Calculate.getEnum(LabMaterialCodeArrNum);
        String LabMaterialCode = Calculate.getEnumValue(LabMaterialCodeNum, LabMaterialCodeArr);

        String[] LabMaterialValueArr = {"",
                "Кровь артериальная",
                "Кровь венозная",
                "Кровь венозная",
                "Кровь венозная",
                "Кровь венозная",
                "Кровь венозная",
                "Кровь венозная",
                "Кровь венозная",
                "Кровь венозная",
                "Кровь венозная",
                "Кровь капиллярная",
                "Кровь капиллярная",
                "Кровь капиллярная",
                "Кровь менструальная",
                "Кровь пуповинная"
        };
        String[] LabMaterialSpecimenValueArr = {"",
                "Кровь артериальная",
                "Кровь венозная",
                "Сыворотка крови",
                "Плазма крови",
                "Эритроциты",
                "Плазма крови бедная тромбоцитами",
                "Плазма крови богатая тромбоцитами",
                "Плазма крови свободная от тромбоцитов",
                "Ретикулоциты",
                "Лейкоциты крови",
                "Кровь сухая капля",
                "Кровь капиллярная",
                "Мазок периферической крови",
                "Кровь менструальная",
                "Кровь пуповинная"
        };

        String LabMaterialValue = Calculate.getEnumValue(LabMaterialCodeNum, LabMaterialValueArr);
        String LabMaterialSpecimenValue = Calculate.getEnumValue(LabMaterialCodeNum, LabMaterialSpecimenValueArr);

        changeLineTest.changeWord("###LabMaterialCode", LabMaterialCode, fileName);
        changeLineTest.changeWord("###LabMaterialValue", LabMaterialValue, fileName);
        changeLineTest.changeWord("###LabMaterialSpecimenValue", LabMaterialSpecimenValue, fileName);

//******************************************************************************

        String[] medServiceCodeArrNum = {"1", "2", "3", "4", "5", "6", "7", "8"};
        String[] medServiceCodeArr = {"", "A11.01.018", "A11.05.001", "A11.12.007", "A11.12.009", "A11.12.013", "A11.07.026", "A11.13.001", "A11.19.011.001"};

        String medServiceCodeNum = Calculate.getEnum(medServiceCodeArrNum);
        String medServiceCode = Calculate.getEnumValue(medServiceCodeNum, medServiceCodeArr);

        String[] medServiceValueArr = {"",
                "Взятие образца биологического материала из очагов поражения на патологический грибок",
                "Взятие крови из пальца",
                "Взятие крови из артерии",
                "Взятие крови из периферической вены",
                "Взятие крови из центральной вены",
                "Взятие образца биологического материала из очагов поражения органов рта",
                "Взятие капиллярной крови",
                "Взятие соскоба с перианальной области на энтеробиоз"};
        String medServiceValue = Calculate.getEnumValue(medServiceCodeNum, medServiceValueArr);

        changeLineTest.changeWord("###medServiceCode", medServiceCode, fileName);
        changeLineTest.changeWord("###medServiceValue", medServiceValue, fileName);

//******************************************************************************

        String[] LabTestCodeArrNum = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
                "20", "21", "22", "23", "24", "25"};
        String[] LabTestCodeArr = {"", "1171750","1169689","1169697","1026657","1026673","1027499","1027945",
                "1028752","1029578","1030436","1030485","1030840",
                "1032309","1032424","1032788","1033778","1034180","1036292","1036383","1037134",
                "1191287","1191329","1058148","1167279","1067974"};
        String LabTestCode1Num = Calculate.getEnum(LabTestCodeArrNum);
        String LabTestCode1 = Calculate.getEnumValue(LabTestCode1Num, LabTestCodeArr);

        String[] LabTestValueArr = {"",
                "Галоперидол, массовая концентрация в моче",
                "Либексин, обнаружение в моче",
                "Амброгексал, обнаружение в моче",
                "Амисульприд, массовая концентрация в сыворотке или плазме крови",
                "Амитриптилин, массовая концентрация в крови",
                "Гамма-аминомасляная кислота, массовая концентрация в сыворотке или плазме крови",
                "Дизопирамид, массовая концентрация в сыворотке или плазме крови",
                "Максилетин, массовая концентрация в сыворотке или плазме крови",
                "Никотин, массовая концентрация в сыворотке или плазме крови",
                "Пароксетин, обнаружение в сыворотке или плазме крови",
                "Пахикарпин, массовая концентрация в сыворотке или плазме крови",
                "Пирацетам, массовая концентрация в сыворотке или плазме крови",
                "Сердечные гликозиды, обнаружение в сыворотке или плазме крови",
                "Сиднокарб, обнаружение в сыворотке или плазме крови",
                "Тавегил, обнаружение в сыворотке или плазме крови",
                "Тразодон, обнаружение в сыворотке или плазме крови",
                "Феназепам и другие бензодиазепины, обнаружение в сыворотке или плазме крови",
                "Цитиколин, обнаружение в сыворотке или плазме крови",
                "Эгилок, обнаружение в сыворотке или плазме крови",
                "Этодолак, обнаружение в сыворотке или плазме крови",
                "Диклофенак, массовая концентрация в крови",
                "Баклофен, обнаружение в сыворотке или плазме крови",
                "Антитела IgE к антигенам белой берёзы, концентрация в условных единицах в сыворотке крови иммунофлуоресцентным или иммунохемилюминесцентным методом",
                "Антитела IgE к антигенам библиотечной пыли, концентрация в условных единицах в сыворотке крови методом иммуноферментного анализа",
                "Антитела IgE к антигенам смеси экстрактов пищевых продуктов: яблоко, груша, персик, вишня, слива, концентрация в условных единицах в сыворотке крови иммунофлуоресцентным методом"
        };
        String LabTestValue1 = Calculate.getEnumValue(LabTestCode1Num, LabTestValueArr);

        changeLineTest.changeWord("###LabTestCode1", LabTestCode1, fileName);
        changeLineTest.changeWord("###LabTestValue1", LabTestValue1, fileName);

//******************************************************************************

        String LabTestCode2Num = Calculate.getEnum(LabTestCodeArrNum);
        String LabTestCode2 = Calculate.getEnumValue(LabTestCode2Num, LabTestCodeArr);

        String LabTestValue2 = Calculate.getEnumValue(LabTestCode2Num, LabTestValueArr);

        changeLineTest.changeWord("###LabTestCode2", LabTestCode2, fileName);
        changeLineTest.changeWord("###LabTestValue2", LabTestValue2, fileName);

//******************************************************************************

        String LabTestCode3Num = Calculate.getEnum(LabTestCodeArrNum);
        String LabTestCode3 = Calculate.getEnumValue(LabTestCode3Num, LabTestCodeArr);

        String LabTestValue3 = Calculate.getEnumValue(LabTestCode3Num, LabTestValueArr);

        changeLineTest.changeWord("###LabTestCode3", LabTestCode3, fileName);
        changeLineTest.changeWord("###LabTestValue3", LabTestValue3, fileName);

//******************************************************************************




//Блок конкатинаций
        //Собираем строки которые будут уникальны для конкретного файла

        String oidMedOrg = ("1.2.643.5.1.13.13.12.2." + patientRegion + "." + Calculate.getRandInt(4));
        changeLineTest.changeWord("###oidMedOrg", oidMedOrg, fileName);
        String patientDocOrgCode = (Calculate.getRandInt(3) + "-" + Calculate.getRandInt(3));
        changeLineTest.changeWord("###patientDocOrgCode", patientDocOrgCode, fileName);
        String medOrgName = (Calculate.getRandStr(10) + " Учреждение здравоохранения " + Calculate.getRandStr(10));
        changeLineTest.changeWord("###medOrgName", medOrgName, fileName);
        String medOrgAddress = ("Город " + Calculate.getRandStr(10) + ", улица " + Calculate.getRandStr(10) + ", дом 2");
        changeLineTest.changeWord("###medOrgAddress", medOrgAddress, fileName);
        String streetAddressLine = ("Город " + Calculate.getRandStr(10) + " улица, " + Calculate.getRandStr(10) + ", дом 2" + ", квартира 2");
        changeLineTest.changeWord("###streetAddressLine", streetAddressLine, fileName);

//Блок генерации уникальных строк
        //Если в файле находим значения string и randInt то передаем в метод changeLineTest.changeWord пустое значение
        //(! ВАЖНО)
        //В самом методе changeLineTest.changeWord нужно добавить проверку, если это string(XX),
        //то вызываем метод генерации строки
        //Это сделано для того, чтобы каждый раз когда мы в тексте находили значение string и randInt вызывалась генерация
        //и данные значения были уникальны

        changeLineTest.changeWord("###randGUID", "", fileName);
        changeLineTest.changeWord("###String(3)", "", fileName);
        changeLineTest.changeWord("###String(5)", "", fileName);
        changeLineTest.changeWord("###String(7)", "", fileName);
        changeLineTest.changeWord("###String(10)", "", fileName);
        changeLineTest.changeWord("###String(25)", "", fileName);
        changeLineTest.changeWord("###String(50)", "", fileName);
        changeLineTest.changeWord("###randInt(1)", "", fileName);
        changeLineTest.changeWord("###randInt(2)", "", fileName);
        changeLineTest.changeWord("###randInt(3)", "", fileName);
        changeLineTest.changeWord("###randInt(4)", "", fileName);
        changeLineTest.changeWord("###randInt(5)", "", fileName);
        changeLineTest.changeWord("###randInt(6)", "", fileName);
        changeLineTest.changeWord("###randInt(9)", "", fileName);
        changeLineTest.changeWord("###randInt(10)", "", fileName);
        changeLineTest.changeWord("###randInt(11)", "", fileName);
        changeLineTest.changeWord("###randInt(18)", "", fileName);

//Блок генерации дат и времени
        //Метод RandomDate.getDataTime генерирует строку с датой в пределах 20 лет + берет текущее время
        //Метод RandomDate.genDate генерирует строку с датой в пределах 20 лет
        //Метод RandomDate.createDAteTime возвращает текущую дату и текущее время
        //Метод RandomDate.createDate возвращает текущую дату

        changeLineTest.changeWord("###genDateTime", RandomDate.genDateTime(), fileName);
        changeLineTest.changeWord("###genDate", RandomDate.genDate(), fileName);
        changeLineTest.changeWord("###createDateTime", RandomDate.createDateTime(), fileName);
        changeLineTest.changeWord("###createDate", RandomDate.createDate(), fileName);


    }

    @Test
    public void runProgrammTest() throws Exception {
        for (int i = 1; i <= 1000; i++) {
            String fileName = "Laboratory" + Integer.toString(i) + ".xml";
            File from = new File("Laboratory.xml");
            File to = new File(fileName);
            copyFile(from, to);
            String GuidEmdId = Calculate.getRandStrInt(8) + "-" + Calculate.getRandStrInt(4) + "-" + Calculate.getRandStrInt(4) + "-" + Calculate.getRandStrInt(4) + "-" + Calculate.getRandStrInt(12);
            changeLineTest.changeWord("####Guid", GuidEmdId, fileName);
            calculateGen(fileName);

        }
    }

    private static void copyFile(File src, File dest) throws IOException {
        Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

}
