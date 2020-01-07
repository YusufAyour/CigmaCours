package heritage_.attributs_.visibility;

public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Double calculerSurface(Form form){
		Double surface = null ;
		if(form instanceof Cercle) {
			surface = ((Cercle)form).rayon * ((Cercle)form).rayon * Math.PI;
		}
		return surface;
	}
}