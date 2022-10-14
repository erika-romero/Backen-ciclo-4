package com.example.demo;

import com.example.demo.interfaces.InterfaceProduct;
import com.example.demo.modelo.ModeloProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
@SpringBootApplication
public class DemoApplication  implements CommandLineRunner {

	@Autowired
	private InterfaceProduct interfaceProduct;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception{
		interfaceProduct.deleteAll();
		List<ModeloProduct> product = new LinkedList<>();
		product.add(new ModeloProduct("B1","BALÓN SÚPER CAMPEONES PRO","Fútbol","Este balón adidas Pro está inspirado en el que se usa en el máximo escenario deportivo.", true,576000,50,"https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/349519b0a9814a6a9b07abaa00b23534_9366/Balon_Super_Campeones_Pro_Blanco_FS0362_01_standard.jpg"));
		product.add(new ModeloProduct("B2","BALÓN DE ENTRENAMIENTO AL RIHLA","Fútbol","Al Rihla significa El Viaje el balón es solo el comienzo.", true,99990,50,"https://assets.adidas.com/images/w_383,h_383,f_auto,q_auto,fl_lossy,c_fill,g_auto/b0c95688020b462baa3dae620133adb0_9366/balon-de-entrenamiento-al-rihla.jpg"));
		product.add(new ModeloProduct("B3","BALÓN AL RIHLA LEAGUE","Fútbol","Con estampados inspirados en el balón oficial de la Copa Mundial de la FIFA", true,159990,50,"https://assets.adidas.com/images/w_383,h_383,f_auto,q_auto,fl_lossy,c_fill,g_auto/b5cc3e3a35674dd89149ae62013372b8_9366/balon-al-rihla-league.jpg"));
		product.add(new ModeloProduct("BK1","BALÓN ALL COURT 3.0","Basketball","Este balón de básquet adidas funciona tanto para canchas cubiertas como al aire libre", true,189990,50,"https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/9a44621a281149709ca4ae420163c466_9366/Balon_All_Court_3.0_Naranja_HM4975_01_standard.jpg"));
		product.add(new ModeloProduct("BK2","BALÓN DE BÁSQUET DE CAUCHO X 3 RAYAS","Basketball","Su caucho suave y resistente se siente bien en cada rebote y cada atrapada", true,99990,50,"https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/75ca25328aed42fc8f67ae3d012a7b76_9366/Balon_de_Basquet_de_Caucho_X_3_Rayas_Naranja_HM4970_01_standard.jpg"));
		product.add(new ModeloProduct("T1","TENIS HARDEN STEPBACK 3","Basketball","Estos tenis adidas exclusivos rinden homenaje a su creatividad en la cancha.", true,479990,50,"https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/12f65123f10a46148f40ae6a016899aa_9366/Tenis_Harden_Stepback_3_Verde_GZ7240_01_standard.jpg"));
		product.add(new ModeloProduct("S2","SHORTS DE BÁSQUET","Basketball"," Las aberturas laterales a la altura del dobladillo te permiten moverte con total libertad", true,159990,50,"https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/04741abb67294c61a2c4ae6f01666b59_9366/Shorts_de_Basquet_Azul_HK7091_21_model.jpg"));
		product.add(new ModeloProduct("G1","GUAYOS X SPEEDPORTAL.4 MULTITERRENO","Fútbol","Estos guayos fueron creados para movimientos rápidos y velocidades que cambian partidos en terreno firme", true,299990,50,"https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/308aab7a50e9491fb35cae9400cb567b_9366/Guayos_X_Speedportal.4_Multiterreno_Azul_GW8492_22_model.jpg"));
		product.add(new ModeloProduct("C1","CAMISETA ESTAMPADA TIRO 23 PRO MANGA CORTA","Ropa","Presenta un ajuste ceñido que se adapta a tu silueta y un tejido elástico que te permite moverte con total comodidad.", true,159990,50,"https://assets.adidas.com/images/w_276,h_276,f_auto,q_auto,fl_lossy,c_fill,g_auto/fbb4febe3a784b56b968aeec00bb28ca_9366/HN7016_21_model.jpg"));
		product.add(new ModeloProduct("M1","MEDIAS CLÁSICAS ACOLCHADAS 3 PARES","Accesorios"," El refuerzo en el arco aporta mayor sujeción y la costura suave en la puntera te proporciona un mejor ajuste.", true,69990,50,"https://assets.adidas.com/images/w_276,h_276,f_auto,q_auto,fl_lossy,c_fill,g_auto/56fab23f7f7643dd96d5aa2c010ad2c8_9366/DZ9356_03_standard.jpg"));

		product.add(new ModeloProduct("B4","BALÓN SÚPER CAMPEONES PRO","Fútbol","Este balón adidas Pro está inspirado en el que se usa en el máximo escenario deportivo.", true,576000,50,"https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/349519b0a9814a6a9b07abaa00b23534_9366/Balon_Super_Campeones_Pro_Blanco_FS0362_01_standard.jpg"));
		product.add(new ModeloProduct("B5","BALÓN DE ENTRENAMIENTO AL RIHLA","Fútbol","Al Rihla significa El Viaje el balón es solo el comienzo.", true,99990,50,"https://assets.adidas.com/images/w_383,h_383,f_auto,q_auto,fl_lossy,c_fill,g_auto/b0c95688020b462baa3dae620133adb0_9366/balon-de-entrenamiento-al-rihla.jpg"));
		product.add(new ModeloProduct("B6","BALÓN AL RIHLA LEAGUE","Fútbol","Con estampados inspirados en el balón oficial de la Copa Mundial de la FIFA", true,159990,50,"https://assets.adidas.com/images/w_383,h_383,f_auto,q_auto,fl_lossy,c_fill,g_auto/b5cc3e3a35674dd89149ae62013372b8_9366/balon-al-rihla-league.jpg"));
		product.add(new ModeloProduct("BK3","BALÓN ALL COURT 3.0","Basketball","Este balón de básquet adidas funciona tanto para canchas cubiertas como al aire libre", true,189990,50,"https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/9a44621a281149709ca4ae420163c466_9366/Balon_All_Court_3.0_Naranja_HM4975_01_standard.jpg"));
		product.add(new ModeloProduct("BK4","BALÓN DE BÁSQUET DE CAUCHO X 3 RAYAS","Basketball","Su caucho suave y resistente se siente bien en cada rebote y cada atrapada", true,99990,50,"https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/75ca25328aed42fc8f67ae3d012a7b76_9366/Balon_de_Basquet_de_Caucho_X_3_Rayas_Naranja_HM4970_01_standard.jpg"));
		product.add(new ModeloProduct("T2","TENIS HARDEN STEPBACK 3","Basketball","Estos tenis adidas exclusivos rinden homenaje a su creatividad en la cancha.", true,479990,50,"https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/12f65123f10a46148f40ae6a016899aa_9366/Tenis_Harden_Stepback_3_Verde_GZ7240_01_standard.jpg"));
		product.add(new ModeloProduct("S3","SHORTS DE BÁSQUET","Basketball"," Las aberturas laterales a la altura del dobladillo te permiten moverte con total libertad", true,159990,50,"https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/04741abb67294c61a2c4ae6f01666b59_9366/Shorts_de_Basquet_Azul_HK7091_21_model.jpg"));
		product.add(new ModeloProduct("G2","GUAYOS X SPEEDPORTAL.4 MULTITERRENO","Fútbol","Estos guayos fueron creados para movimientos rápidos y velocidades que cambian partidos en terreno firme", true,299990,50,"https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/308aab7a50e9491fb35cae9400cb567b_9366/Guayos_X_Speedportal.4_Multiterreno_Azul_GW8492_22_model.jpg"));
		product.add(new ModeloProduct("C2","CAMISETA ESTAMPADA TIRO 23 PRO MANGA CORTA","Ropa","Presenta un ajuste ceñido que se adapta a tu silueta y un tejido elástico que te permite moverte con total comodidad.", true,159990,50,"https://assets.adidas.com/images/w_276,h_276,f_auto,q_auto,fl_lossy,c_fill,g_auto/fbb4febe3a784b56b968aeec00bb28ca_9366/HN7016_21_model.jpg"));
		product.add(new ModeloProduct("M2","MEDIAS CLÁSICAS ACOLCHADAS 3 PARES","Accesorios"," El refuerzo en el arco aporta mayor sujeción y la costura suave en la puntera te proporciona un mejor ajuste.", true,69990,50,"https://assets.adidas.com/images/w_276,h_276,f_auto,q_auto,fl_lossy,c_fill,g_auto/56fab23f7f7643dd96d5aa2c010ad2c8_9366/DZ9356_03_standard.jpg"));
		interfaceProduct.saveAll(product);
 	}
}
