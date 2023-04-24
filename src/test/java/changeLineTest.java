import java.io.*;

public class changeLineTest {

// Метод changeWord открывает файл и посрочно проверяет совпадения слов если слово нашлось,
// то изменяем методом replace найденое слово.
// Если в файле добавилась замена string или randInt то необходимо данную проверку добавить в else if
// это необходимо для генерации уникальных значений


    public static void changeWord(String searchWord, String changeWord, String fileName) throws IOException {

        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            String strLine;
            while ((strLine = br.readLine()) != null) {
                if (searchWord == "###randGUID") {
                    String change = Calculate.getRandStrInt(8) + "-" + Calculate.getRandStrInt(4) + "-" + Calculate.getRandStrInt(4) + "-" + Calculate.getRandStrInt(4) + "-" + Calculate.getRandStrInt(12);
                    sb.append(strLine.replace(searchWord, change)).append("\r\n");}
                else if (searchWord=="###String(3)") {
                    String change = Calculate.getRandStr(3);
                    sb.append(strLine.replace(searchWord, change)).append("\r\n");}
                else if (searchWord=="###String(5)") {
                    String change = Calculate.getRandStr(5);
                    sb.append(strLine.replace(searchWord, change)).append("\r\n");}
                else if (searchWord=="###String(7)") {
                    String change = Calculate.getRandStr(7);
                    sb.append(strLine.replace(searchWord, change)).append("\r\n");}
                else if (searchWord=="###String(10)") {
                    String change = Calculate.getRandStr(10);
                    sb.append(strLine.replace(searchWord, change)).append("\r\n");}
                else if (searchWord=="###String(25)") {
                    String change = Calculate.getRandStr(10);
                    sb.append(strLine.replace(searchWord, change)).append("\r\n");}
                else if (searchWord=="###String(50)") {
                    String change = Calculate.getRandStr(50);
                    sb.append(strLine.replace(searchWord, change)).append("\r\n");}
                else if (searchWord=="###randInt(1)") {
                    String change = Calculate.getRandInt(1);
                    sb.append(strLine.replace(searchWord, change)).append("\r\n");}
                else if (searchWord=="###randInt(2)") {
                    String change = Calculate.getRandInt(2);
                    sb.append(strLine.replace(searchWord, change)).append("\r\n");}
                else if (searchWord=="###randInt(3)") {
                    String change = Calculate.getRandInt(3);
                    sb.append(strLine.replace(searchWord, change)).append("\r\n");}
                else if (searchWord=="###randInt(4)") {
                    String change = Calculate.getRandInt(4);
                    sb.append(strLine.replace(searchWord, change)).append("\r\n");}
                else if (searchWord=="###randInt(5)") {
                    String change = Calculate.getRandInt(5);
                    sb.append(strLine.replace(searchWord, change)).append("\r\n");}
                else if (searchWord=="###randInt(6)") {
                    String change = Calculate.getRandInt(6);
                    sb.append(strLine.replace(searchWord, change)).append("\r\n");}
                else if (searchWord=="###randInt(9)") {
                    String change = Calculate.getRandInt(9);
                    sb.append(strLine.replace(searchWord, change)).append("\r\n");}
                else if (searchWord=="###randInt(10)") {
                    String change = Calculate.getRandInt(10);
                    sb.append(strLine.replace(searchWord, change)).append("\r\n");}
                else if (searchWord=="###randInt(11)") {
                    String change = Calculate.getRandInt(11);
                    sb.append(strLine.replace(searchWord, change)).append("\r\n");}
                else if (searchWord=="###randInt(18)") {
                    String change = Calculate.getRandInt(18);
                    sb.append(strLine.replace(searchWord, change)).append("\r\n");}
                else {sb.append(strLine.replace(searchWord, changeWord)).append("\r\n");}
            }
        }
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(sb.toString());
        }
        System.out.println(searchWord+"---"+changeWord);

    }
}
