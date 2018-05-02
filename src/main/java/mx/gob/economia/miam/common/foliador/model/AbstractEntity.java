package mx.gob.economia.miam.common.foliador.model;

import com.google.gson.annotations.SerializedName;


//@JsonIgnoreProperties(ignoreUnknown = true)
public class AbstractEntity {
	@SerializedName("id")
    private long persitenceId;
    private String persistenceVersion;

    public long getPersitenceId() {
        return persitenceId;
    }

    public void setPersitenceId(long persitenceId) {
        this.persitenceId = persitenceId;
    }

    public String getPersistenceVersion() {
        return persistenceVersion;
    }

    public void setPersistenceVersion(String persistenceVersion) {
        this.persistenceVersion = persistenceVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractEntity that = (AbstractEntity) o;

        if (persitenceId != that.persitenceId) return false;
        return !(persistenceVersion != null ? !persistenceVersion.equals(that.persistenceVersion) : that.persistenceVersion != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (persitenceId ^ (persitenceId >>> 32));
        result = 31 * result + (persistenceVersion != null ? persistenceVersion.hashCode() : 0);
        return result;
    }
}
