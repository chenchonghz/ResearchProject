package cs.dcd.dataexportforweka;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.Map;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException
    {
		String inputPath = ReadFiles.readDirectoryPath("Input Target Path: ");
    	String outputPath = ReadFiles.readDirectoryPath("Output Target Path: ");
    	Map<Integer, String> fileMap = ReadFiles.readFileMap(inputPath);
    	
    	TreeSet<String> medicineSet = CreateFeatureMap.CreateFeatureMapFromDict("D:/Eclipse-WorkSpace/DataExportForWeka/src/中药.dic");
    	TreeSet<String> prescriptionSet = CreateFeatureMap.CreateFeatureMapFromDict("D:/Eclipse-WorkSpace/DataExportForWeka/src/方剂.dic");
    	TreeSet<String> symptomAndDiseaseSet = CreateFeatureMap.CreateFeatureMapFromDict("D:/Eclipse-WorkSpace/DataExportForWeka/src/医案病名病症.dic");
    	
    	TreeSet<String> medicineLocalSet = new TreeSet<String>();
    	TreeSet<String> prescriptionLocalSet = new TreeSet<String>();
    	TreeSet<String> symptomAndDiseaseLocalSet = new TreeSet<String>();	
    	
    	for (Map.Entry<Integer, String> entry : fileMap.entrySet())
		{
			int fileKey = entry.getKey();
			String inputFilePath = entry.getValue();
			
			BufferedReader fileInput = new BufferedReader(new FileReader(inputFilePath));
			String str;
			
			String[] fileName = inputFilePath.split("\\\\");
			
			while ((str = fileInput.readLine()) != null)
			{	
				str.replaceAll("", "\r");
				
				if (medicineSet.contains(str))
				{
					medicineLocalSet.add(str);
				}
				else if (prescriptionSet.contains(str))
				{
					prescriptionLocalSet.add(str);
				}
				else if (symptomAndDiseaseSet.contains(str))
				{
					symptomAndDiseaseLocalSet.add(str);
				}
				else
				{
					
				}
			}
			
			fileInput.close();
		}
    	
    	PrintWriter dataSetOutput = new PrintWriter(new FileWriter(outputPath + "\\" + "DataSet.arff"));
    	
    	dataSetOutput.println("@relation tcm");
    	dataSetOutput.println();
    	
    	for (String item : medicineLocalSet)
    	{
    		dataSetOutput.println("@attribute '" + item + "' { t}");
    	}
    	
    	for (String item : prescriptionLocalSet)
    	{
    		dataSetOutput.println("@attribute '" + item + "' { t}");
    	}
    	
    	for (String item : symptomAndDiseaseLocalSet)
    	{
    		dataSetOutput.println("@attribute '" + item + "' { t}");
    	}
    	
//    	for (int i = 1; i <= 100; i++)
//    	{
//    		dataSetOutput.println("@attribute Medicine" + i + " {" + medicineLocalSet.toString().substring(1, medicineLocalSet.toString().length()-1) + "}");	
//    	}    	
//    	for (int i = 1; i <= 50; i++)
//    	{
//    		dataSetOutput.println("@attribute Prescription" + i + " {" + prescriptionLocalSet.toString().substring(1, prescriptionLocalSet.toString().length()-1) + "}");	
//    	}    	
//    	for (int i = 1; i <= 50; i++)
//    	{
//    		dataSetOutput.println("@attribute SymptomAndDisease" + i + " {" + symptomAndDiseaseLocalSet.toString().substring(1, symptomAndDiseaseLocalSet.toString().length()-1) + "}");	
//    	}
    	
    	dataSetOutput.println();
    	
    	dataSetOutput.println("@data");
    	
    	TreeSet<String> medicine = new TreeSet<String>();
    	TreeSet<String> prescription = new TreeSet<String>();
    	TreeSet<String> symptomAndDisease = new TreeSet<String>();
    	
    	for (Map.Entry<Integer, String> entry : fileMap.entrySet())
		{
			int fileKey = entry.getKey();
			String inputFilePath = entry.getValue();
			
			medicine.clear();
			prescription.clear();
			symptomAndDisease.clear();
			
			BufferedReader fileInput = new BufferedReader(new FileReader(inputFilePath));
			String str;
			
			String[] fileName = inputFilePath.split("\\\\");
			
			while ((str = fileInput.readLine()) != null)
			{	
				str.replaceAll("", "\r");
				
				if (medicineLocalSet.contains(str))
				{
					medicine.add(str);
				}
				else if (prescriptionLocalSet.contains(str))
				{
					prescription.add(str);
				}
				else if (symptomAndDiseaseLocalSet.contains(str))
				{
					symptomAndDisease.add(str);
				}
				else
				{
					
				}
			}
			
			fileInput.close();
			
			String data = "";
			
			for (String item : medicineLocalSet)
	    	{
	    		if (medicine.contains(item))
	    		{
	    			data += "t,";
	    		}
	    		else 
	    		{
	    			data += "?,";
				}
	    	}
	    	
			for (String item : prescriptionLocalSet)
	    	{
	    		if (prescription.contains(item))
	    		{
	    			data += "t,";
	    		}
	    		else 
	    		{
	    			data += "?,";
				}
	    	}
			
			for (String item : symptomAndDiseaseLocalSet)
	    	{
	    		if (symptomAndDisease.contains(item))
	    		{
	    			data += "t,";
	    		}
	    		else 
	    		{
	    			data += "?,";
				}
	    	}
			
			dataSetOutput.println(data.substring(0, data.length()-1));
			
		}
    	    	
    	dataSetOutput.close();
    	
    	PrintWriter dataMedicineSetOutput = new PrintWriter(new FileWriter(outputPath + "\\" + "MedicineDataSet.txt"));
    	PrintWriter dataPrescriptionSetOutput = new PrintWriter(new FileWriter(outputPath + "\\" + "PrescriptionDataSet.txt"));
    	PrintWriter dataSymptomAndDiseaseSetOutput = new PrintWriter(new FileWriter(outputPath + "\\" + "SymptomAndDiseaseDataSet.txt"));
    	
    	for (String item : medicineLocalSet)
    	{
    		dataMedicineSetOutput.println(item);
    	}
    	
    	for (String item : prescriptionLocalSet)
    	{
    		dataPrescriptionSetOutput.println(item);
    	}
    	
    	for (String item : symptomAndDiseaseLocalSet)
    	{
    		dataSymptomAndDiseaseSetOutput.println(item);
    	}
    	
    	dataMedicineSetOutput.close();
    	dataPrescriptionSetOutput.close();
    	dataSymptomAndDiseaseSetOutput.close();
    	
    	System.out.println("Done!");
    	
    }
	
}
