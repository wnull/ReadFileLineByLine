package com.company;

import java.io.*;

public class ReadFileLineByLine
{
    public static void main(String[] args)
    {
        try {
            File file = new File("D:\\Text.txt.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считываем первую строку
            String str = reader.readLine();
            // пока строка не пустая,проделываем махинацию:
            while (str != null)
            {
                // вводим целочисленную переменную length,которая подсчитывает символы в строке,
                int length = str.length();
                // если в строке больше 5 символов - выводим эту строчку
                if (length > 5)
                {
                    System.out.println(str);
                }
                // считываем остальные строки в цикле
                str = reader.readLine();
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





