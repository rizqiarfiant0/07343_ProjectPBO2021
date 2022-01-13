package pendaftarankursus_07343;

public class PendaftarTerdaftarEntity_07343 {
private PendaftaKelasEntity_07343 pendaftarEntity;
private int indexKelas;
private String kodePendaftar;

public PendaftarTerdaftarEntity_07343(PendaftaKelasEntity_07343 pendaftarEntity, int indexKelas, String kodePendaftar){
    this.pendaftarEntity = pendaftarEntity;
    this.indexKelas = indexKelas;
    this.kodePendaftar = kodePendaftar;
    }

public PendaftaKelasEntity_07343 getPendaftarEntity(){
    return pendaftarEntity;
    }

public void setpendaftarEntity(PendaftaKelasEntity_07343 PendaftarEntity){
    this.pendaftarEntity = pendaftarEntity;
    }

public int getIndexKelas(){
    return indexKelas;
    }

public void setIndexKelas(int indexKelas){
    this.indexKelas = indexKelas;
    }

public String getKodePendaftar(){
    return kodePendaftar;
    }

public void setKodePendaftar(String kodePendaftar){
    this.kodePendaftar = kodePendaftar;
    }
}