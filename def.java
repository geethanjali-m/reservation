public class Codebeautify {
 Project ProjectObject;


 // Getter Methods 

 public Project getProject() {
  return ProjectObject;
 }

 // Setter Methods 

 public void setProject(Project ProjectObject) {
  this.ProjectObject = ProjectObject;
 }
}
public class Project {
 ProjectInfo ProjectInfoObject;
 Models ModelsObject;
 Diagrams DiagramsObject;
 private String _author;
 private String _commentTableSortAscending;
 private String _commentTableSortColumn;
 private String _description;
 private String _documentationType;
 private String _exportedFromDifferentName;
 private String _exporterVersion;
 private String _name;
 private String _textualAnalysisHighlightCaseSensitive;
 private String _umlVersion;


 // Getter Methods 

 public ProjectInfo getProjectInfo() {
  return ProjectInfoObject;
 }

 public Models getModels() {
  return ModelsObject;
 }

 public Diagrams getDiagrams() {
  return DiagramsObject;
 }

 public String get_author() {
  return _author;
 }

 public String get_commentTableSortAscending() {
  return _commentTableSortAscending;
 }

 public String get_commentTableSortColumn() {
  return _commentTableSortColumn;
 }

 public String get_description() {
  return _description;
 }

 public String get_documentationType() {
  return _documentationType;
 }

 public String get_exportedFromDifferentName() {
  return _exportedFromDifferentName;
 }

 public String get_exporterVersion() {
  return _exporterVersion;
 }

 public String get_name() {
  return _name;
 }

 public String get_textualAnalysisHighlightCaseSensitive() {
  return _textualAnalysisHighlightCaseSensitive;
 }

 public String get_umlVersion() {
  return _umlVersion;
 }

 // Setter Methods 

 public void setProjectInfo(ProjectInfo ProjectInfoObject) {
  this.ProjectInfoObject = ProjectInfoObject;
 }

 public void setModels(Models ModelsObject) {
  this.ModelsObject = ModelsObject;
 }

 public void setDiagrams(Diagrams DiagramsObject) {
  this.DiagramsObject = DiagramsObject;
 }

 public void set_author(String _author) {
  this._author = _author;
 }

 public void set_commentTableSortAscending(String _commentTableSortAscending) {
  this._commentTableSortAscending = _commentTableSortAscending;
 }

 public void set_commentTableSortColumn(String _commentTableSortColumn) {
  this._commentTableSortColumn = _commentTableSortColumn;
 }

 public void set_description(String _description) {
  this._description = _description;
 }

 public void set_documentationType(String _documentationType) {
  this._documentationType = _documentationType;
 }

 public void set_exportedFromDifferentName(String _exportedFromDifferentName) {
  this._exportedFromDifferentName = _exportedFromDifferentName;
 }

 public void set_exporterVersion(String _exporterVersion) {
  this._exporterVersion = _exporterVersion;
 }

 public void set_name(String _name) {
  this._name = _name;
 }

 public void set_textualAnalysisHighlightCaseSensitive(String _textualAnalysisHighlightCaseSensitive) {
  this._textualAnalysisHighlightCaseSensitive = _textualAnalysisHighlightCaseSensitive;
 }

 public void set_umlVersion(String _umlVersion) {
  this._umlVersion = _umlVersion;
 }
}
public class Diagrams {
 Diagram DiagramObject;


 // Getter Methods 

 public Diagram getDiagram() {
  return DiagramObject;
 }

 // Setter Methods 

 public void setDiagram(Diagram DiagramObject) {
  this.DiagramObject = DiagramObject;
 }
}
public class Diagram {
 DiagramProperties DiagramPropertiesObject;
 Shapes ShapesObject;
 Connectors ConnectorsObject;
 private String _connectorStyle;
 private String _diagramType;
 private String _displayDiagramType;
 private String _documentation;
 private String _id;
 private String _imageHeight;
 private String _imageScale;
 private String _imageWidth;
 private String _name;
 private String _rtfDocumentation;
 private String _trimmedHeight;
 private String _trimmedWidth;


 // Getter Methods 

 public DiagramProperties getDiagramProperties() {
  return DiagramPropertiesObject;
 }

 public Shapes getShapes() {
  return ShapesObject;
 }

 public Connectors getConnectors() {
  return ConnectorsObject;
 }

 public String get_connectorStyle() {
  return _connectorStyle;
 }

 public String get_diagramType() {
  return _diagramType;
 }

 public String get_displayDiagramType() {
  return _displayDiagramType;
 }

 public String get_documentation() {
  return _documentation;
 }

 public String get_id() {
  return _id;
 }

 public String get_imageHeight() {
  return _imageHeight;
 }

 public String get_imageScale() {
  return _imageScale;
 }

 public String get_imageWidth() {
  return _imageWidth;
 }

 public String get_name() {
  return _name;
 }

 public String get_rtfDocumentation() {
  return _rtfDocumentation;
 }

 public String get_trimmedHeight() {
  return _trimmedHeight;
 }

 public String get_trimmedWidth() {
  return _trimmedWidth;
 }

 // Setter Methods 

 public void setDiagramProperties(DiagramProperties DiagramPropertiesObject) {
  this.DiagramPropertiesObject = DiagramPropertiesObject;
 }

 public void setShapes(Shapes ShapesObject) {
  this.ShapesObject = ShapesObject;
 }

 public void setConnectors(Connectors ConnectorsObject) {
  this.ConnectorsObject = ConnectorsObject;
 }

 public void set_connectorStyle(String _connectorStyle) {
  this._connectorStyle = _connectorStyle;
 }

 public void set_diagramType(String _diagramType) {
  this._diagramType = _diagramType;
 }

 public void set_displayDiagramType(String _displayDiagramType) {
  this._displayDiagramType = _displayDiagramType;
 }

 public void set_documentation(String _documentation) {
  this._documentation = _documentation;
 }

 public void set_id(String _id) {
  this._id = _id;
 }

 public void set_imageHeight(String _imageHeight) {
  this._imageHeight = _imageHeight;
 }

 public void set_imageScale(String _imageScale) {
  this._imageScale = _imageScale;
 }

 public void set_imageWidth(String _imageWidth) {
  this._imageWidth = _imageWidth;
 }

 public void set_name(String _name) {
  this._name = _name;
 }

 public void set_rtfDocumentation(String _rtfDocumentation) {
  this._rtfDocumentation = _rtfDocumentation;
 }

 public void set_trimmedHeight(String _trimmedHeight) {
  this._trimmedHeight = _trimmedHeight;
 }

 public void set_trimmedWidth(String _trimmedWidth) {
  this._trimmedWidth = _trimmedWidth;
 }
}
public class Connectors {
 ArrayList < Object > Connector = new ArrayList < Object > ();


 // Getter Methods 



 // Setter Methods 


}
public class Shapes {
 ArrayList < Object > Shape = new ArrayList < Object > ();


 // Getter Methods 



 // Setter Methods 


}
public class DiagramProperties {
 ArrayList < Object > BooleanProperty = new ArrayList < Object > ();
 ArrayList < Object > StringProperty = new ArrayList < Object > ();
 LongProperty LongPropertyObject;
 ArrayList < Object > IntegerProperty = new ArrayList < Object > ();
 ArrayList < Object > ColorProperty = new ArrayList < Object > ();
 DoubleProperty DoublePropertyObject;
 ArrayList < Object > ModelRefProperty = new ArrayList < Object > ();
 ArrayList < Object > StringArrayProperty = new ArrayList < Object > ();
 DiagramRefProperty DiagramRefPropertyObject;


 // Getter Methods 

 public LongProperty getLongProperty() {
  return LongPropertyObject;
 }

 public DoubleProperty getDoubleProperty() {
  return DoublePropertyObject;
 }

 public DiagramRefProperty getDiagramRefProperty() {
  return DiagramRefPropertyObject;
 }

 // Setter Methods 

 public void setLongProperty(LongProperty LongPropertyObject) {
  this.LongPropertyObject = LongPropertyObject;
 }

 public void setDoubleProperty(DoubleProperty DoublePropertyObject) {
  this.DoublePropertyObject = DoublePropertyObject;
 }

 public void setDiagramRefProperty(DiagramRefProperty DiagramRefPropertyObject) {
  this.DiagramRefPropertyObject = DiagramRefPropertyObject;
 }
}
public class DiagramRefProperty {
 private String _displayName;
 private String _name;


 // Getter Methods 

 public String get_displayName() {
  return _displayName;
 }

 public String get_name() {
  return _name;
 }

 // Setter Methods 

 public void set_displayName(String _displayName) {
  this._displayName = _displayName;
 }

 public void set_name(String _name) {
  this._name = _name;
 }
}
public class DoubleProperty {
 private String _displayName;
 private String _name;
 private String _value;


 // Getter Methods 

 public String get_displayName() {
  return _displayName;
 }

 public String get_name() {
  return _name;
 }

 public String get_value() {
  return _value;
 }

 // Setter Methods 

 public void set_displayName(String _displayName) {
  this._displayName = _displayName;
 }

 public void set_name(String _name) {
  this._name = _name;
 }

 public void set_value(String _value) {
  this._value = _value;
 }
}
public class LongProperty {
 private String _displayName;
 private String _name;
 private String _value;


 // Getter Methods 

 public String get_displayName() {
  return _displayName;
 }

 public String get_name() {
  return _name;
 }

 public String get_value() {
  return _value;
 }

 // Setter Methods 

 public void set_displayName(String _displayName) {
  this._displayName = _displayName;
 }

 public void set_name(String _name) {
  this._name = _name;
 }

 public void set_value(String _value) {
  this._value = _value;
 }
}
public class Models {
 ArrayList < Object > Model = new ArrayList < Object > ();


 // Getter Methods 



 // Setter Methods 


}
public class ProjectInfo {
 private String LogicalView;
 ProjectOptions ProjectOptionsObject;


 // Getter Methods 

 public String getLogicalView() {
  return LogicalView;
 }

 public ProjectOptions getProjectOptions() {
  return ProjectOptionsObject;
 }

 // Setter Methods 

 public void setLogicalView(String LogicalView) {
  this.LogicalView = LogicalView;
 }

 public void setProjectOptions(ProjectOptions ProjectOptionsObject) {
  this.ProjectOptionsObject = ProjectOptionsObject;
 }
}
public class ProjectOptions {
 DiagramOptions DiagramOptionsObject;
 GeneralOptions GeneralOptionsObject;
 InstantReverseOptions InstantReverseOptionsObject;
 ModelQualityOptions ModelQualityOptionsObject;
 ORMOptions ORMOptionsObject;
 RequirementDiagramOptions RequirementDiagramOptionsObject;
 StateCodeEngineOptions StateCodeEngineOptionsObject;
 WarningOptions WarningOptionsObject;
 PORepository PORepositoryObject;


 // Getter Methods 

 public DiagramOptions getDiagramOptions() {
  return DiagramOptionsObject;
 }

 public GeneralOptions getGeneralOptions() {
  return GeneralOptionsObject;
 }

 public InstantReverseOptions getInstantReverseOptions() {
  return InstantReverseOptionsObject;
 }

 public ModelQualityOptions getModelQualityOptions() {
  return ModelQualityOptionsObject;
 }

 public ORMOptions getORMOptions() {
  return ORMOptionsObject;
 }

 public RequirementDiagramOptions getRequirementDiagramOptions() {
  return RequirementDiagramOptionsObject;
 }

 public StateCodeEngineOptions getStateCodeEngineOptions() {
  return StateCodeEngineOptionsObject;
 }

 public WarningOptions getWarningOptions() {
  return WarningOptionsObject;
 }

 public PORepository getPORepository() {
  return PORepositoryObject;
 }

 // Setter Methods 

 public void setDiagramOptions(DiagramOptions DiagramOptionsObject) {
  this.DiagramOptionsObject = DiagramOptionsObject;
 }

 public void setGeneralOptions(GeneralOptions GeneralOptionsObject) {
  this.GeneralOptionsObject = GeneralOptionsObject;
 }

 public void setInstantReverseOptions(InstantReverseOptions InstantReverseOptionsObject) {
  this.InstantReverseOptionsObject = InstantReverseOptionsObject;
 }

 public void setModelQualityOptions(ModelQualityOptions ModelQualityOptionsObject) {
  this.ModelQualityOptionsObject = ModelQualityOptionsObject;
 }

 public void setORMOptions(ORMOptions ORMOptionsObject) {
  this.ORMOptionsObject = ORMOptionsObject;
 }

 public void setRequirementDiagramOptions(RequirementDiagramOptions RequirementDiagramOptionsObject) {
  this.RequirementDiagramOptionsObject = RequirementDiagramOptionsObject;
 }

 public void setStateCodeEngineOptions(StateCodeEngineOptions StateCodeEngineOptionsObject) {
  this.StateCodeEngineOptionsObject = StateCodeEngineOptionsObject;
 }

 public void setWarningOptions(WarningOptions WarningOptionsObject) {
  this.WarningOptionsObject = WarningOptionsObject;
 }

 public void setPORepository(PORepository PORepositoryObject) {
  this.PORepositoryObject = PORepositoryObject;
 }
}
public class PORepository {
 POUserIDFormats POUserIDFormatsObject;


 // Getter Methods 

 public POUserIDFormats getPOUserIDFormats() {
  return POUserIDFormatsObject;
 }

 // Setter Methods 

 public void setPOUserIDFormats(POUserIDFormats POUserIDFormatsObject) {
  this.POUserIDFormatsObject = POUserIDFormatsObject;
 }
}
public class POUserIDFormats {
 ArrayList < Object > POUserIDFormat = new ArrayList < Object > ();


 // Getter Methods 



 // Setter Methods 


}
public class WarningOptions {
 BooleanProperty BooleanPropertyObject;


 // Getter Methods 

 public BooleanProperty getBooleanProperty() {
  return BooleanPropertyObject;
 }

 // Setter Methods 

 public void setBooleanProperty(BooleanProperty BooleanPropertyObject) {
  this.BooleanPropertyObject = BooleanPropertyObject;
 }
}
public class BooleanProperty {
 private String _displayName;
 private String _name;
 private String _value;


 // Getter Methods 

 public String get_displayName() {
  return _displayName;
 }

 public String get_name() {
  return _name;
 }

 public String get_value() {
  return _value;
 }

 // Setter Methods 

 public void set_displayName(String _displayName) {
  this._displayName = _displayName;
 }

 public void set_name(String _name) {
  this._name = _name;
 }

 public void set_value(String _value) {
  this._value = _value;
 }
}
public class StateCodeEngineOptions {
 ArrayList < Object > BooleanProperty = new ArrayList < Object > ();
 ArrayList < Object > IntegerProperty = new ArrayList < Object > ();
 StringProperty StringPropertyObject;


 // Getter Methods 

 public StringProperty getStringProperty() {
  return StringPropertyObject;
 }

 // Setter Methods 

 public void setStringProperty(StringProperty StringPropertyObject) {
  this.StringPropertyObject = StringPropertyObject;
 }
}
public class StringProperty {
 private String _displayName;
 private String _name;
 private String _value;


 // Getter Methods 

 public String get_displayName() {
  return _displayName;
 }

 public String get_name() {
  return _name;
 }

 public String get_value() {
  return _value;
 }

 // Setter Methods 

 public void set_displayName(String _displayName) {
  this._displayName = _displayName;
 }

 public void set_name(String _name) {
  this._name = _name;
 }

 public void set_value(String _value) {
  this._value = _value;
 }
}
public class RequirementDiagramOptions {
 StringProperty StringPropertyObject;
 ArrayList < Object > BooleanProperty = new ArrayList < Object > ();


 // Getter Methods 

 public StringProperty getStringProperty() {
  return StringPropertyObject;
 }

 // Setter Methods 

 public void setStringProperty(StringProperty StringPropertyObject) {
  this.StringPropertyObject = StringPropertyObject;
 }
}
public class StringProperty {
 private String _displayName;
 private String _name;
 private String _value;


 // Getter Methods 

 public String get_displayName() {
  return _displayName;
 }

 public String get_name() {
  return _name;
 }

 public String get_value() {
  return _value;
 }

 // Setter Methods 

 public void set_displayName(String _displayName) {
  this._displayName = _displayName;
 }

 public void set_name(String _name) {
  this._name = _name;
 }

 public void set_value(String _value) {
  this._value = _value;
 }
}
public class ORMOptions {
 ArrayList < Object > StringProperty = new ArrayList < Object > ();
 ArrayList < Object > BooleanProperty = new ArrayList < Object > ();
 ArrayList < Object > IntegerProperty = new ArrayList < Object > ();


 // Getter Methods 



 // Setter Methods 


}
public class ModelQualityOptions {
 BooleanProperty BooleanPropertyObject;


 // Getter Methods 

 public BooleanProperty getBooleanProperty() {
  return BooleanPropertyObject;
 }

 // Setter Methods 

 public void setBooleanProperty(BooleanProperty BooleanPropertyObject) {
  this.BooleanPropertyObject = BooleanPropertyObject;
 }
}
public class BooleanProperty {
 private String _displayName;
 private String _name;
 private String _value;


 // Getter Methods 

 public String get_displayName() {
  return _displayName;
 }

 public String get_name() {
  return _name;
 }

 public String get_value() {
  return _value;
 }

 // Setter Methods 

 public void set_displayName(String _displayName) {
  this._displayName = _displayName;
 }

 public void set_name(String _name) {
  this._name = _name;
 }

 public void set_value(String _value) {
  this._value = _value;
 }
}
public class InstantReverseOptions {
 ArrayList < Object > StringProperty = new ArrayList < Object > ();
 ArrayList < Object > BooleanProperty = new ArrayList < Object > ();


 // Getter Methods 



 // Setter Methods 


}
public class GeneralOptions {
 BooleanProperty BooleanPropertyObject;
 StringProperty StringPropertyObject;


 // Getter Methods 

 public BooleanProperty getBooleanProperty() {
  return BooleanPropertyObject;
 }

 public StringProperty getStringProperty() {
  return StringPropertyObject;
 }

 // Setter Methods 

 public void setBooleanProperty(BooleanProperty BooleanPropertyObject) {
  this.BooleanPropertyObject = BooleanPropertyObject;
 }

 public void setStringProperty(StringProperty StringPropertyObject) {
  this.StringPropertyObject = StringPropertyObject;
 }
}
public class StringProperty {
 private String _displayName;
 private String _name;
 private String _value;


 // Getter Methods 

 public String get_displayName() {
  return _displayName;
 }

 public String get_name() {
  return _name;
 }

 public String get_value() {
  return _value;
 }

 // Setter Methods 

 public void set_displayName(String _displayName) {
  this._displayName = _displayName;
 }

 public void set_name(String _name) {
  this._name = _name;
 }

 public void set_value(String _value) {
  this._value = _value;
 }
}
public class BooleanProperty {
 private String _displayName;
 private String _name;
 private String _value;


 // Getter Methods 

 public String get_displayName() {
  return _displayName;
 }

 public String get_name() {
  return _name;
 }

 public String get_value() {
  return _value;
 }

 // Setter Methods 

 public void set_displayName(String _displayName) {
  this._displayName = _displayName;
 }

 public void set_name(String _name) {
  this._name = _name;
 }

 public void set_value(String _value) {
  this._value = _value;
 }
}
public class DiagramOptions {
 ArrayList < Object > BooleanProperty = new ArrayList < Object > ();
 ArrayList < Object > StringProperty = new ArrayList < Object > ();
 ArrayList < Object > ColorProperty = new ArrayList < Object > ();
 DefaultHtmlDocFont DefaultHtmlDocFontObject;
 ArrayList < Object > IntegerProperty = new ArrayList < Object > ();


 // Getter Methods 

 public DefaultHtmlDocFont getDefaultHtmlDocFont() {
  return DefaultHtmlDocFontObject;
 }

 // Setter Methods 

 public void setDefaultHtmlDocFont(DefaultHtmlDocFont defaultHtmlDocFontObject) {
  this.DefaultHtmlDocFontObject = defaultHtmlDocFontObject;
 }
}
public class DefaultHtmlDocFont {
 private String _family;
 private String _size;
 private String _style;


 // Getter Methods 

 public String get_family() {
  return _family;
 }

 public String get_size() {
  return _size;
 }

 public String get_style() {
  return _style;
 }

 // Setter Methods 

 public void set_family(String _family) {
  this._family = _family;
 }

 public void set_size(String _size) {
  this._size = _size;
 }

 public void set_style(String _style) {
  this._style = _style;
 }
}