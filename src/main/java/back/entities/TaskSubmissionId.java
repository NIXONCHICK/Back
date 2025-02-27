package back.entities;

import jakarta.persistence.Embeddable;
import lombok.Data;
import java.io.Serializable;

@Data
@Embeddable
public class TaskSubmissionId implements Serializable {
  private Long taskId;
  private Long personId;

  public TaskSubmissionId() {}

  public TaskSubmissionId(Long taskId, Long personId) {
    this.taskId = taskId;
    this.personId = personId;
  }
}
