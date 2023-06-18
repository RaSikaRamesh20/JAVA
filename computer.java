package cO1;

import java.util.Scanner;

class cpu{
	int price;
	class processor{
		int cores;
		String manufacturer_p;
		public static class ram{
			int memory;
			String manufacturer_r;
			}
		}
	}

public class computer {
	public static void main(String[] args) {
		cpu c = new cpu();
		cpu.processor p = c.new processor();
		cpu.processor.ram r = new cpu.processor.ram();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the price of the cpu: ");
		c.price = in.nextInt();
		
		System.out.println("Enter the number of cores the cpu: ");
		p.cores = in.nextInt();
		
		System.out.println("Enter the manufacturer of the cpu: ");
		p.manufacturer_p = in.next();
		
		System.out.println("Enter the size of the RAM ");
		r.memory = in.nextInt();
		
		System.out.println("Enter the manufacturer of the RAM: ");
		r.manufacturer_r = in.next();
	
		System.out.println("-------------------------------------------------------------");
		System.out.println("Price of cpu:"+"$"+c.price);
		System.out.println("No.of cores:"+p.cores);
		System.out.println("Manufacturer of the cpu:"+p.manufacturer_p);
		System.out.println("Size of the RAM:"+r.memory);
		System.out.println("Manufacturer of the RAM:"+r.manufacturer_r);
	}
}