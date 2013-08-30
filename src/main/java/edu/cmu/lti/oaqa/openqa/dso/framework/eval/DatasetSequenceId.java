package edu.cmu.lti.oaqa.openqa.dso.framework.eval;

public class DatasetSequenceId {
	  String dataset;
	  String sequenceId;

	  public DatasetSequenceId(String dataset, String sequenceId) {
	    super();
	    this.dataset = dataset;
	    this.sequenceId = sequenceId;
	  }

	  @Override
	  public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((dataset == null) ? 0 : dataset.hashCode());
	    result = prime * result
	        + ((sequenceId == null) ? 0 : sequenceId.hashCode());
	    return result;
	  }

	  @Override
	  public boolean equals(Object obj) {
	    if (this == obj)
	      return true;
	    if (obj == null)
	      return false;
	    if (getClass() != obj.getClass())
	      return false;
	    DatasetSequenceId other = (DatasetSequenceId) obj;
	    if (dataset == null) {
	      if (other.dataset != null)
	        return false;
	    } else if (!dataset.equals(other.dataset))
	      return false;
	    if (sequenceId == null) {
	      if (other.sequenceId != null)
	        return false;
	    } else if (!sequenceId.equals(other.sequenceId))
	      return false;
	    return true;
	  }
	} 
