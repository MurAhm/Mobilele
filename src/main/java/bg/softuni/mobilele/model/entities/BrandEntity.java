package bg.softuni.mobilele.model.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="brands")
public class BrandEntity extends BaseEntity {

  @Column(unique = true, nullable = false)
  private String name;

  @OneToMany(cascade = CascadeType.ALL)
  private List<ModelEntity> models;

  public String getName() {
    return name;
  }

  public BrandEntity setName(String name) {
    this.name = name;
    return this;
  }

  public List<ModelEntity> getModels() {
    return models;
  }

  public void setModels(List<ModelEntity> models) {
    this.models = models;
  }

  @Override
  public String toString() {
    return "BrandEntity{" +
        "name='" + name + '\'' +
        ", id=" + id +
        ", created=" + created +
        ", updated=" + updated +
        '}';
  }
}
