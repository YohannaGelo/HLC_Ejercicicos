package Apartado5Interface;

public enum TipoCereal {
	avena(5),
	maiz(8),
	trigo(12),
	otro(15);

	private final int calorias;

	TipoCereal(int calorias) {
        this.calorias = calorias;
    }

//    @Override
//    public String toString() {
//        return caloria;
//    }
//	
	
}
