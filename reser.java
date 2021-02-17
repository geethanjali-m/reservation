// Welcome4.java

package io.codebeautify;

public class Welcome4 {
    private Project project;

    public Project getProject() { return project; }
    public void setProject(Project value) { this.project = value; }
}

// Project.java

package io.codebeautify;

public class Project {
    private ProjectInfo projectInfo;
    private Models models;
    private Diagrams diagrams;
    private Author author;
    private String commentTableSortAscending;
    private String commentTableSortColumn;
    private String documentationType;
    private String exportedFromDifferentName;
    private String exporterVersion;
    private String name;
    private String textualAnalysisHighlightOptionCaseSensitive;
    private String umlVersion;
    private String xmlStructure;

    public ProjectInfo getProjectInfo() { return projectInfo; }
    public void setProjectInfo(ProjectInfo value) { this.projectInfo = value; }

    public Models getModels() { return models; }
    public void setModels(Models value) { this.models = value; }

    public Diagrams getDiagrams() { return diagrams; }
    public void setDiagrams(Diagrams value) { this.diagrams = value; }

    public Author getAuthor() { return author; }
    public void setAuthor(Author value) { this.author = value; }

    public String getCommentTableSortAscending() { return commentTableSortAscending; }
    public void setCommentTableSortAscending(String value) { this.commentTableSortAscending = value; }

    public String getCommentTableSortColumn() { return commentTableSortColumn; }
    public void setCommentTableSortColumn(String value) { this.commentTableSortColumn = value; }

    public String getDocumentationType() { return documentationType; }
    public void setDocumentationType(String value) { this.documentationType = value; }

    public String getExportedFromDifferentName() { return exportedFromDifferentName; }
    public void setExportedFromDifferentName(String value) { this.exportedFromDifferentName = value; }

    public String getExporterVersion() { return exporterVersion; }
    public void setExporterVersion(String value) { this.exporterVersion = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getTextualAnalysisHighlightOptionCaseSensitive() { return textualAnalysisHighlightOptionCaseSensitive; }
    public void setTextualAnalysisHighlightOptionCaseSensitive(String value) { this.textualAnalysisHighlightOptionCaseSensitive = value; }

    public String getUMLVersion() { return umlVersion; }
    public void setUMLVersion(String value) { this.umlVersion = value; }

    public String getXMLStructure() { return xmlStructure; }
    public void setXMLStructure(String value) { this.xmlStructure = value; }
}

// Author.java

package io.codebeautify;

import java.io.IOException;

public enum Author {
    GEETHA;

    public String toValue() {
        switch (this) {
            case GEETHA: return "geetha";
        }
        return null;
    }

    public static Author forValue(String value) throws IOException {
        if (value.equals("geetha")) return GEETHA;
        throw new IOException("Cannot deserialize Author");
    }
}

// Diagrams.java

package io.codebeautify;

public class Diagrams {
    private InteractionDiagram interactionDiagram;

    public InteractionDiagram getInteractionDiagram() { return interactionDiagram; }
    public void setInteractionDiagram(InteractionDiagram value) { this.interactionDiagram = value; }
}

// InteractionDiagram.java

package io.codebeautify;

import java.time.OffsetDateTime;

public class InteractionDiagram {
    private Shapes shapes;
    private Connectors connectors;
    private String alignToGrid;
    private String autoExtendActivations;
    private String autoFitShapesSize;
    private String connectionPointStyle;
    private String connectorLabelOrientation;
    private String connectorLineJumps;
    private String connectorLineJumpsSize;
    private String connectorModelElementNameAlignment;
    private String connectorStyle;
    private String diagramBackground;
    private String displayLifeLinesAsRobustnessAnalysisIcon;
    private String editable;
    private String followDiagramParentElement;
    private String gridColor;
    private String gridHeight;
    private String gridVisible;
    private String gridWidth;
    private String height;
    private String hideConnectorIfFromToIsHidden;
    private String hideEmptyTaggedValues;
    private String id;
    private String imageHeight;
    private String imageScale;
    private String imageWidth;
    private String initializeDiagramForCreate;
    private String interactionLifeLinePresentationOption;
    private String maximized;
    private String modelElementNameAlignment;
    private String name;
    private String paintConnectorThroughLabel;
    private Author pmAuthor;
    private OffsetDateTime pmCreateDateTime;
    private OffsetDateTime pmLastModified;
    private String pointConnectorEndToCompartmentMember;
    private String qualityScore;
    private String requestFitSizeWithPromptUser;
    private String requestValidateSnapToGrid;
    private String sequenceNumberHandling;
    private String sequenceNumbering;
    private String shapePresentationOption;
    private String showActivations;
    private String showActivityStateNodeCaption;
    private String showAllocatedFrom;
    private String showAllocatedTo;
    private String showArgumentsInMessagesOperationSignature;
    private String showColorLegend;
    private String showConnectorLegend;
    private String showConnectorName;
    private String showConstraints;
    private String showDefaultPackage;
    private String showInformationItemOption;
    private String showMessageName;
    private String showMessageStereotype;
    private String showMessagesOperationSignature;
    private String showPMAuthor;
    private String showPMDifficulty;
    private String showPMDiscipline;
    private String showPMIteration;
    private String showPMPhase;
    private String showPMPriority;
    private String showPMStatus;
    private String showPMVersion;
    private String showPackageNameStyle;
    private String showParameterNamesInMessageOperationSignature;
    private String showParameterTypesInMessageOperationSignature;
    private String showSequenceNumbers;
    private String showShapeLegend;
    private String showShapeStereotypeIconName;
    private String showStereotypes;
    private String showTaggedValues;
    private String teamworkCreateDateTime;
    private String trimmedHeight;
    private String trimmedWidth;
    private String width;
    private String x;
    private String y;
    private String zoomRatio;
    private String globalPaletteOption;
    private String requestFixDiagramForRoseImport;
    private String requestRecalculateSequenceNumbers;
    private String rootFrame;
    private String documentation;

    public Shapes getShapes() { return shapes; }
    public void setShapes(Shapes value) { this.shapes = value; }

    public Connectors getConnectors() { return connectors; }
    public void setConnectors(Connectors value) { this.connectors = value; }

    public String getAlignToGrid() { return alignToGrid; }
    public void setAlignToGrid(String value) { this.alignToGrid = value; }

    public String getAutoExtendActivations() { return autoExtendActivations; }
    public void setAutoExtendActivations(String value) { this.autoExtendActivations = value; }

    public String getAutoFitShapesSize() { return autoFitShapesSize; }
    public void setAutoFitShapesSize(String value) { this.autoFitShapesSize = value; }

    public String getConnectionPointStyle() { return connectionPointStyle; }
    public void setConnectionPointStyle(String value) { this.connectionPointStyle = value; }

    public String getConnectorLabelOrientation() { return connectorLabelOrientation; }
    public void setConnectorLabelOrientation(String value) { this.connectorLabelOrientation = value; }

    public String getConnectorLineJumps() { return connectorLineJumps; }
    public void setConnectorLineJumps(String value) { this.connectorLineJumps = value; }

    public String getConnectorLineJumpsSize() { return connectorLineJumpsSize; }
    public void setConnectorLineJumpsSize(String value) { this.connectorLineJumpsSize = value; }

    public String getConnectorModelElementNameAlignment() { return connectorModelElementNameAlignment; }
    public void setConnectorModelElementNameAlignment(String value) { this.connectorModelElementNameAlignment = value; }

    public String getConnectorStyle() { return connectorStyle; }
    public void setConnectorStyle(String value) { this.connectorStyle = value; }

    public String getDiagramBackground() { return diagramBackground; }
    public void setDiagramBackground(String value) { this.diagramBackground = value; }

    public String getDisplayLifeLinesAsRobustnessAnalysisIcon() { return displayLifeLinesAsRobustnessAnalysisIcon; }
    public void setDisplayLifeLinesAsRobustnessAnalysisIcon(String value) { this.displayLifeLinesAsRobustnessAnalysisIcon = value; }

    public String getEditable() { return editable; }
    public void setEditable(String value) { this.editable = value; }

    public String getFollowDiagramParentElement() { return followDiagramParentElement; }
    public void setFollowDiagramParentElement(String value) { this.followDiagramParentElement = value; }

    public String getGridColor() { return gridColor; }
    public void setGridColor(String value) { this.gridColor = value; }

    public String getGridHeight() { return gridHeight; }
    public void setGridHeight(String value) { this.gridHeight = value; }

    public String getGridVisible() { return gridVisible; }
    public void setGridVisible(String value) { this.gridVisible = value; }

    public String getGridWidth() { return gridWidth; }
    public void setGridWidth(String value) { this.gridWidth = value; }

    public String getHeight() { return height; }
    public void setHeight(String value) { this.height = value; }

    public String getHideConnectorIfFromToIsHidden() { return hideConnectorIfFromToIsHidden; }
    public void setHideConnectorIfFromToIsHidden(String value) { this.hideConnectorIfFromToIsHidden = value; }

    public String getHideEmptyTaggedValues() { return hideEmptyTaggedValues; }
    public void setHideEmptyTaggedValues(String value) { this.hideEmptyTaggedValues = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public String getImageHeight() { return imageHeight; }
    public void setImageHeight(String value) { this.imageHeight = value; }

    public String getImageScale() { return imageScale; }
    public void setImageScale(String value) { this.imageScale = value; }

    public String getImageWidth() { return imageWidth; }
    public void setImageWidth(String value) { this.imageWidth = value; }

    public String getInitializeDiagramForCreate() { return initializeDiagramForCreate; }
    public void setInitializeDiagramForCreate(String value) { this.initializeDiagramForCreate = value; }

    public String getInteractionLifeLinePresentationOption() { return interactionLifeLinePresentationOption; }
    public void setInteractionLifeLinePresentationOption(String value) { this.interactionLifeLinePresentationOption = value; }

    public String getMaximized() { return maximized; }
    public void setMaximized(String value) { this.maximized = value; }

    public String getModelElementNameAlignment() { return modelElementNameAlignment; }
    public void setModelElementNameAlignment(String value) { this.modelElementNameAlignment = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getPaintConnectorThroughLabel() { return paintConnectorThroughLabel; }
    public void setPaintConnectorThroughLabel(String value) { this.paintConnectorThroughLabel = value; }

    public Author getPmAuthor() { return pmAuthor; }
    public void setPmAuthor(Author value) { this.pmAuthor = value; }

    public OffsetDateTime getPmCreateDateTime() { return pmCreateDateTime; }
    public void setPmCreateDateTime(OffsetDateTime value) { this.pmCreateDateTime = value; }

    public OffsetDateTime getPmLastModified() { return pmLastModified; }
    public void setPmLastModified(OffsetDateTime value) { this.pmLastModified = value; }

    public String getPointConnectorEndToCompartmentMember() { return pointConnectorEndToCompartmentMember; }
    public void setPointConnectorEndToCompartmentMember(String value) { this.pointConnectorEndToCompartmentMember = value; }

    public String getQualityScore() { return qualityScore; }
    public void setQualityScore(String value) { this.qualityScore = value; }

    public String getRequestFitSizeWithPromptUser() { return requestFitSizeWithPromptUser; }
    public void setRequestFitSizeWithPromptUser(String value) { this.requestFitSizeWithPromptUser = value; }

    public String getRequestValidateSnapToGrid() { return requestValidateSnapToGrid; }
    public void setRequestValidateSnapToGrid(String value) { this.requestValidateSnapToGrid = value; }

    public String getSequenceNumberHandling() { return sequenceNumberHandling; }
    public void setSequenceNumberHandling(String value) { this.sequenceNumberHandling = value; }

    public String getSequenceNumbering() { return sequenceNumbering; }
    public void setSequenceNumbering(String value) { this.sequenceNumbering = value; }

    public String getShapePresentationOption() { return shapePresentationOption; }
    public void setShapePresentationOption(String value) { this.shapePresentationOption = value; }

    public String getShowActivations() { return showActivations; }
    public void setShowActivations(String value) { this.showActivations = value; }

    public String getShowActivityStateNodeCaption() { return showActivityStateNodeCaption; }
    public void setShowActivityStateNodeCaption(String value) { this.showActivityStateNodeCaption = value; }

    public String getShowAllocatedFrom() { return showAllocatedFrom; }
    public void setShowAllocatedFrom(String value) { this.showAllocatedFrom = value; }

    public String getShowAllocatedTo() { return showAllocatedTo; }
    public void setShowAllocatedTo(String value) { this.showAllocatedTo = value; }

    public String getShowArgumentsInMessagesOperationSignature() { return showArgumentsInMessagesOperationSignature; }
    public void setShowArgumentsInMessagesOperationSignature(String value) { this.showArgumentsInMessagesOperationSignature = value; }

    public String getShowColorLegend() { return showColorLegend; }
    public void setShowColorLegend(String value) { this.showColorLegend = value; }

    public String getShowConnectorLegend() { return showConnectorLegend; }
    public void setShowConnectorLegend(String value) { this.showConnectorLegend = value; }

    public String getShowConnectorName() { return showConnectorName; }
    public void setShowConnectorName(String value) { this.showConnectorName = value; }

    public String getShowConstraints() { return showConstraints; }
    public void setShowConstraints(String value) { this.showConstraints = value; }

    public String getShowDefaultPackage() { return showDefaultPackage; }
    public void setShowDefaultPackage(String value) { this.showDefaultPackage = value; }

    public String getShowInformationItemOption() { return showInformationItemOption; }
    public void setShowInformationItemOption(String value) { this.showInformationItemOption = value; }

    public String getShowMessageName() { return showMessageName; }
    public void setShowMessageName(String value) { this.showMessageName = value; }

    public String getShowMessageStereotype() { return showMessageStereotype; }
    public void setShowMessageStereotype(String value) { this.showMessageStereotype = value; }

    public String getShowMessagesOperationSignature() { return showMessagesOperationSignature; }
    public void setShowMessagesOperationSignature(String value) { this.showMessagesOperationSignature = value; }

    public String getShowPMAuthor() { return showPMAuthor; }
    public void setShowPMAuthor(String value) { this.showPMAuthor = value; }

    public String getShowPMDifficulty() { return showPMDifficulty; }
    public void setShowPMDifficulty(String value) { this.showPMDifficulty = value; }

    public String getShowPMDiscipline() { return showPMDiscipline; }
    public void setShowPMDiscipline(String value) { this.showPMDiscipline = value; }

    public String getShowPMIteration() { return showPMIteration; }
    public void setShowPMIteration(String value) { this.showPMIteration = value; }

    public String getShowPMPhase() { return showPMPhase; }
    public void setShowPMPhase(String value) { this.showPMPhase = value; }

    public String getShowPMPriority() { return showPMPriority; }
    public void setShowPMPriority(String value) { this.showPMPriority = value; }

    public String getShowPMStatus() { return showPMStatus; }
    public void setShowPMStatus(String value) { this.showPMStatus = value; }

    public String getShowPMVersion() { return showPMVersion; }
    public void setShowPMVersion(String value) { this.showPMVersion = value; }

    public String getShowPackageNameStyle() { return showPackageNameStyle; }
    public void setShowPackageNameStyle(String value) { this.showPackageNameStyle = value; }

    public String getShowParameterNamesInMessageOperationSignature() { return showParameterNamesInMessageOperationSignature; }
    public void setShowParameterNamesInMessageOperationSignature(String value) { this.showParameterNamesInMessageOperationSignature = value; }

    public String getShowParameterTypesInMessageOperationSignature() { return showParameterTypesInMessageOperationSignature; }
    public void setShowParameterTypesInMessageOperationSignature(String value) { this.showParameterTypesInMessageOperationSignature = value; }

    public String getShowSequenceNumbers() { return showSequenceNumbers; }
    public void setShowSequenceNumbers(String value) { this.showSequenceNumbers = value; }

    public String getShowShapeLegend() { return showShapeLegend; }
    public void setShowShapeLegend(String value) { this.showShapeLegend = value; }

    public String getShowShapeStereotypeIconName() { return showShapeStereotypeIconName; }
    public void setShowShapeStereotypeIconName(String value) { this.showShapeStereotypeIconName = value; }

    public String getShowStereotypes() { return showStereotypes; }
    public void setShowStereotypes(String value) { this.showStereotypes = value; }

    public String getShowTaggedValues() { return showTaggedValues; }
    public void setShowTaggedValues(String value) { this.showTaggedValues = value; }

    public String getTeamworkCreateDateTime() { return teamworkCreateDateTime; }
    public void setTeamworkCreateDateTime(String value) { this.teamworkCreateDateTime = value; }

    public String getTrimmedHeight() { return trimmedHeight; }
    public void setTrimmedHeight(String value) { this.trimmedHeight = value; }

    public String getTrimmedWidth() { return trimmedWidth; }
    public void setTrimmedWidth(String value) { this.trimmedWidth = value; }

    public String getWidth() { return width; }
    public void setWidth(String value) { this.width = value; }

    public String getX() { return x; }
    public void setX(String value) { this.x = value; }

    public String getY() { return y; }
    public void setY(String value) { this.y = value; }

    public String getZoomRatio() { return zoomRatio; }
    public void setZoomRatio(String value) { this.zoomRatio = value; }

    public String getGlobalPaletteOption() { return globalPaletteOption; }
    public void setGlobalPaletteOption(String value) { this.globalPaletteOption = value; }

    public String getRequestFixDiagramForRoseImport() { return requestFixDiagramForRoseImport; }
    public void setRequestFixDiagramForRoseImport(String value) { this.requestFixDiagramForRoseImport = value; }

    public String getRequestRecalculateSequenceNumbers() { return requestRecalculateSequenceNumbers; }
    public void setRequestRecalculateSequenceNumbers(String value) { this.requestRecalculateSequenceNumbers = value; }

    public String getRootFrame() { return rootFrame; }
    public void setRootFrame(String value) { this.rootFrame = value; }

    public String getDocumentation() { return documentation; }
    public void setDocumentation(String value) { this.documentation = value; }
}

// Connectors.java

package io.codebeautify;

public class Connectors {
    private ConnectorsMessage[] message;

    public ConnectorsMessage[] getMessage() { return message; }
    public void setMessage(ConnectorsMessage[] value) { this.message = value; }
}

// ConnectorsMessage.java

package io.codebeautify;

public class ConnectorsMessage {
    private ElementFont elementFont;
    private Line line;
    private Caption caption;
    private Points points;
    private DefaultFontColor background;
    private String connectorLabelOrientation;
    private String connectorLineJumps;
    private ConnectorStyle connectorStyle;
    private String folded;
    private DefaultFontColor foreground;
    private From from;
    private String fromConnectType;
    private String fromPinType;
    private String fromShapeXDiff;
    private String fromShapeYDiff;
    private String height;
    private String id;
    private String metaModelElement;
    private String model;
    private String modelElementNameAlignment;
    private String name;
    private String paintThroughLabel;
    private String requestRebuild;
    private String requestRebuildFromEnd;
    private String requestRebuildToEnd;
    private String requestResetCaption;
    private String requestResetCaptionFitWidth;
    private String requestResetCaptionSize;
    private String selectable;
    private String showArgumentsInMessageOperationSignature;
    private String showConnectorName;
    private String showMessageName;
    private String showMessageOperationSignature;
    private String showParameterNamesInMessageOperationSignature;
    private String showParameterTypesInMessageOperationSignature;
    private From to;
    private String toConnectType;
    private String toPinType;
    private String toShapeXDiff;
    private String toShapeYDiff;
    private String useFromShapeCenter;
    private String useToShapeCenter;
    private String width;
    private String x;
    private String y;
    private String zOrder;

    public ElementFont getElementFont() { return elementFont; }
    public void setElementFont(ElementFont value) { this.elementFont = value; }

    public Line getLine() { return line; }
    public void setLine(Line value) { this.line = value; }

    public Caption getCaption() { return caption; }
    public void setCaption(Caption value) { this.caption = value; }

    public Points getPoints() { return points; }
    public void setPoints(Points value) { this.points = value; }

    public DefaultFontColor getBackground() { return background; }
    public void setBackground(DefaultFontColor value) { this.background = value; }

    public String getConnectorLabelOrientation() { return connectorLabelOrientation; }
    public void setConnectorLabelOrientation(String value) { this.connectorLabelOrientation = value; }

    public String getConnectorLineJumps() { return connectorLineJumps; }
    public void setConnectorLineJumps(String value) { this.connectorLineJumps = value; }

    public ConnectorStyle getConnectorStyle() { return connectorStyle; }
    public void setConnectorStyle(ConnectorStyle value) { this.connectorStyle = value; }

    public String getFolded() { return folded; }
    public void setFolded(String value) { this.folded = value; }

    public DefaultFontColor getForeground() { return foreground; }
    public void setForeground(DefaultFontColor value) { this.foreground = value; }

    public From getFrom() { return from; }
    public void setFrom(From value) { this.from = value; }

    public String getFromConnectType() { return fromConnectType; }
    public void setFromConnectType(String value) { this.fromConnectType = value; }

    public String getFromPinType() { return fromPinType; }
    public void setFromPinType(String value) { this.fromPinType = value; }

    public String getFromShapeXDiff() { return fromShapeXDiff; }
    public void setFromShapeXDiff(String value) { this.fromShapeXDiff = value; }

    public String getFromShapeYDiff() { return fromShapeYDiff; }
    public void setFromShapeYDiff(String value) { this.fromShapeYDiff = value; }

    public String getHeight() { return height; }
    public void setHeight(String value) { this.height = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public String getMetaModelElement() { return metaModelElement; }
    public void setMetaModelElement(String value) { this.metaModelElement = value; }

    public String getModel() { return model; }
    public void setModel(String value) { this.model = value; }

    public String getModelElementNameAlignment() { return modelElementNameAlignment; }
    public void setModelElementNameAlignment(String value) { this.modelElementNameAlignment = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getPaintThroughLabel() { return paintThroughLabel; }
    public void setPaintThroughLabel(String value) { this.paintThroughLabel = value; }

    public String getRequestRebuild() { return requestRebuild; }
    public void setRequestRebuild(String value) { this.requestRebuild = value; }

    public String getRequestRebuildFromEnd() { return requestRebuildFromEnd; }
    public void setRequestRebuildFromEnd(String value) { this.requestRebuildFromEnd = value; }

    public String getRequestRebuildToEnd() { return requestRebuildToEnd; }
    public void setRequestRebuildToEnd(String value) { this.requestRebuildToEnd = value; }

    public String getRequestResetCaption() { return requestResetCaption; }
    public void setRequestResetCaption(String value) { this.requestResetCaption = value; }

    public String getRequestResetCaptionFitWidth() { return requestResetCaptionFitWidth; }
    public void setRequestResetCaptionFitWidth(String value) { this.requestResetCaptionFitWidth = value; }

    public String getRequestResetCaptionSize() { return requestResetCaptionSize; }
    public void setRequestResetCaptionSize(String value) { this.requestResetCaptionSize = value; }

    public String getSelectable() { return selectable; }
    public void setSelectable(String value) { this.selectable = value; }

    public String getShowArgumentsInMessageOperationSignature() { return showArgumentsInMessageOperationSignature; }
    public void setShowArgumentsInMessageOperationSignature(String value) { this.showArgumentsInMessageOperationSignature = value; }

    public String getShowConnectorName() { return showConnectorName; }
    public void setShowConnectorName(String value) { this.showConnectorName = value; }

    public String getShowMessageName() { return showMessageName; }
    public void setShowMessageName(String value) { this.showMessageName = value; }

    public String getShowMessageOperationSignature() { return showMessageOperationSignature; }
    public void setShowMessageOperationSignature(String value) { this.showMessageOperationSignature = value; }

    public String getShowParameterNamesInMessageOperationSignature() { return showParameterNamesInMessageOperationSignature; }
    public void setShowParameterNamesInMessageOperationSignature(String value) { this.showParameterNamesInMessageOperationSignature = value; }

    public String getShowParameterTypesInMessageOperationSignature() { return showParameterTypesInMessageOperationSignature; }
    public void setShowParameterTypesInMessageOperationSignature(String value) { this.showParameterTypesInMessageOperationSignature = value; }

    public From getTo() { return to; }
    public void setTo(From value) { this.to = value; }

    public String getToConnectType() { return toConnectType; }
    public void setToConnectType(String value) { this.toConnectType = value; }

    public String getToPinType() { return toPinType; }
    public void setToPinType(String value) { this.toPinType = value; }

    public String getToShapeXDiff() { return toShapeXDiff; }
    public void setToShapeXDiff(String value) { this.toShapeXDiff = value; }

    public String getToShapeYDiff() { return toShapeYDiff; }
    public void setToShapeYDiff(String value) { this.toShapeYDiff = value; }

    public String getUseFromShapeCenter() { return useFromShapeCenter; }
    public void setUseFromShapeCenter(String value) { this.useFromShapeCenter = value; }

    public String getUseToShapeCenter() { return useToShapeCenter; }
    public void setUseToShapeCenter(String value) { this.useToShapeCenter = value; }

    public String getWidth() { return width; }
    public void setWidth(String value) { this.width = value; }

    public String getX() { return x; }
    public void setX(String value) { this.x = value; }

    public String getY() { return y; }
    public void setY(String value) { this.y = value; }

    public String getZOrder() { return zOrder; }
    public void setZOrder(String value) { this.zOrder = value; }
}

// DefaultFontColor.java

package io.codebeautify;

import java.io.IOException;

public enum DefaultFontColor {
    RGB_000;

    public String toValue() {
        switch (this) {
            case RGB_000: return "rgb(0, 0, 0)";
        }
        return null;
    }

    public static DefaultFontColor forValue(String value) throws IOException {
        if (value.equals("rgb(0, 0, 0)")) return RGB_000;
        throw new IOException("Cannot deserialize DefaultFontColor");
    }
}

// Caption.java

package io.codebeautify;

public class Caption {
    private String height;
    private String internalHeight;
    private String internalWidth;
    private Side side;
    private String visible;
    private String width;
    private String x;
    private String y;

    public String getHeight() { return height; }
    public void setHeight(String value) { this.height = value; }

    public String getInternalHeight() { return internalHeight; }
    public void setInternalHeight(String value) { this.internalHeight = value; }

    public String getInternalWidth() { return internalWidth; }
    public void setInternalWidth(String value) { this.internalWidth = value; }

    public Side getSide() { return side; }
    public void setSide(Side value) { this.side = value; }

    public String getVisible() { return visible; }
    public void setVisible(String value) { this.visible = value; }

    public String getWidth() { return width; }
    public void setWidth(String value) { this.width = value; }

    public String getX() { return x; }
    public void setX(String value) { this.x = value; }

    public String getY() { return y; }
    public void setY(String value) { this.y = value; }
}

// Side.java

package io.codebeautify;

import java.io.IOException;

public enum Side {
    INVISIBLE, NONE;

    public String toValue() {
        switch (this) {
            case INVISIBLE: return "Invisible";
            case NONE: return "None";
        }
        return null;
    }

    public static Side forValue(String value) throws IOException {
        if (value.equals("Invisible")) return INVISIBLE;
        if (value.equals("None")) return NONE;
        throw new IOException("Cannot deserialize Side");
    }
}

// ConnectorStyle.java

package io.codebeautify;

import java.io.IOException;

public enum ConnectorStyle {
    FOLLOW_DIAGRAM;

    public String toValue() {
        switch (this) {
            case FOLLOW_DIAGRAM: return "Follow Diagram";
        }
        return null;
    }

    public static ConnectorStyle forValue(String value) throws IOException {
        if (value.equals("Follow Diagram")) return FOLLOW_DIAGRAM;
        throw new IOException("Cannot deserialize ConnectorStyle");
    }
}

// ElementFont.java

package io.codebeautify;

public class ElementFont {
    private DefaultFontColor color;
    private Family name;
    private String size;
    private String style;

    public DefaultFontColor getColor() { return color; }
    public void setColor(DefaultFontColor value) { this.color = value; }

    public Family getName() { return name; }
    public void setName(Family value) { this.name = value; }

    public String getSize() { return size; }
    public void setSize(String value) { this.size = value; }

    public String getStyle() { return style; }
    public void setStyle(String value) { this.style = value; }
}

// Family.java

package io.codebeautify;

import java.io.IOException;

public enum Family {
    DIALOG;

    public String toValue() {
        switch (this) {
            case DIALOG: return "Dialog";
        }
        return null;
    }

    public static Family forValue(String value) throws IOException {
        if (value.equals("Dialog")) return DIALOG;
        throw new IOException("Cannot deserialize Family");
    }
}

// From.java

package io.codebeautify;

import java.io.IOException;

public enum From {
    D_G1_A_CE6_G_AQ_BW_AQ_WT, M_KD_A_CE6_G_AQ_BW_AQW2, THE_0_YL_A_CE6_G_AQ_BW_AQ_WK, YFDA_CE6_G_AQ_BW_AQW;

    public String toValue() {
        switch (this) {
            case D_G1_A_CE6_G_AQ_BW_AQ_WT: return "dG1ACe6GAqBwAQWt";
            case M_KD_A_CE6_G_AQ_BW_AQW2: return "MKdACe6GAqBwAQW2";
            case THE_0_YL_A_CE6_G_AQ_BW_AQ_WK: return "0YlACe6GAqBwAQWk";
            case YFDA_CE6_G_AQ_BW_AQW: return "YFDACe6GAqBwAQW_";
        }
        return null;
    }

    public static From forValue(String value) throws IOException {
        if (value.equals("dG1ACe6GAqBwAQWt")) return D_G1_A_CE6_G_AQ_BW_AQ_WT;
        if (value.equals("MKdACe6GAqBwAQW2")) return M_KD_A_CE6_G_AQ_BW_AQW2;
        if (value.equals("0YlACe6GAqBwAQWk")) return THE_0_YL_A_CE6_G_AQ_BW_AQ_WK;
        if (value.equals("YFDACe6GAqBwAQW_")) return YFDA_CE6_G_AQ_BW_AQW;
        throw new IOException("Cannot deserialize From");
    }
}

// Line.java

package io.codebeautify;

public class Line {
    private String stroke;
    private String cap;
    private DefaultFontColor color;
    private String transparency;
    private String weight;

    public String getStroke() { return stroke; }
    public void setStroke(String value) { this.stroke = value; }

    public String getCap() { return cap; }
    public void setCap(String value) { this.cap = value; }

    public DefaultFontColor getColor() { return color; }
    public void setColor(DefaultFontColor value) { this.color = value; }

    public String getTransparency() { return transparency; }
    public void setTransparency(String value) { this.transparency = value; }

    public String getWeight() { return weight; }
    public void setWeight(String value) { this.weight = value; }
}

// Points.java

package io.codebeautify;

public class Points {
    private Point[] point;

    public Point[] getPoint() { return point; }
    public void setPoint(Point[] value) { this.point = value; }
}

// Point.java

package io.codebeautify;

public class Point {
    private String x;
    private String y;

    public String getX() { return x; }
    public void setX(String value) { this.x = value; }

    public String getY() { return y; }
    public void setY(String value) { this.y = value; }
}

// Shapes.java

package io.codebeautify;

public class Shapes {
    private ActivationElement[] activation;
    private ActivationElement[] interactionLifeLine;

    public ActivationElement[] getActivation() { return activation; }
    public void setActivation(ActivationElement[] value) { this.activation = value; }

    public ActivationElement[] getInteractionLifeLine() { return interactionLifeLine; }
    public void setInteractionLifeLine(ActivationElement[] value) { this.interactionLifeLine = value; }
}

// ActivationElement.java

package io.codebeautify;

public class ActivationElement {
    private ElementFont elementFont;
    private Line line;
    private Caption caption;
    private FillColor fillColor;
    private Background background;
    private String connectToPoint;
    private String connectionPointType;
    private String coverConnector;
    private DefaultFontColor foreground;
    private String height;
    private String id;
    private String metaModelElement;
    private String model;
    private String modelElementNameAlignment;
    private String name;
    private String overrideAppearanceWithStereotypeIcon;
    private String parentConnectorDTheta;
    private String parentConnectorHeaderLength;
    private String parentConnectorLineLength;
    private String presentationOption;
    private String primitiveShapeType;
    private String requestDefaultSize;
    private String requestFitSize;
    private String requestFitSizeFromCenter;
    private String requestResetCaption;
    private String requestResetCaptionFitWidth;
    private String requestResetCaptionSize;
    private String requestSetSizeOption;
    private String selectable;
    private String showAllocatedFrom;
    private String showAllocatedTo;
    private String showStereotypeIconName;
    private String width;
    private String x;
    private String y;
    private String zOrder;
    private String parentFrame;
    private String showClassifier;

    public ElementFont getElementFont() { return elementFont; }
    public void setElementFont(ElementFont value) { this.elementFont = value; }

    public Line getLine() { return line; }
    public void setLine(Line value) { this.line = value; }

    public Caption getCaption() { return caption; }
    public void setCaption(Caption value) { this.caption = value; }

    public FillColor getFillColor() { return fillColor; }
    public void setFillColor(FillColor value) { this.fillColor = value; }

    public Background getBackground() { return background; }
    public void setBackground(Background value) { this.background = value; }

    public String getConnectToPoint() { return connectToPoint; }
    public void setConnectToPoint(String value) { this.connectToPoint = value; }

    public String getConnectionPointType() { return connectionPointType; }
    public void setConnectionPointType(String value) { this.connectionPointType = value; }

    public String getCoverConnector() { return coverConnector; }
    public void setCoverConnector(String value) { this.coverConnector = value; }

    public DefaultFontColor getForeground() { return foreground; }
    public void setForeground(DefaultFontColor value) { this.foreground = value; }

    public String getHeight() { return height; }
    public void setHeight(String value) { this.height = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public String getMetaModelElement() { return metaModelElement; }
    public void setMetaModelElement(String value) { this.metaModelElement = value; }

    public String getModel() { return model; }
    public void setModel(String value) { this.model = value; }

    public String getModelElementNameAlignment() { return modelElementNameAlignment; }
    public void setModelElementNameAlignment(String value) { this.modelElementNameAlignment = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getOverrideAppearanceWithStereotypeIcon() { return overrideAppearanceWithStereotypeIcon; }
    public void setOverrideAppearanceWithStereotypeIcon(String value) { this.overrideAppearanceWithStereotypeIcon = value; }

    public String getParentConnectorDTheta() { return parentConnectorDTheta; }
    public void setParentConnectorDTheta(String value) { this.parentConnectorDTheta = value; }

    public String getParentConnectorHeaderLength() { return parentConnectorHeaderLength; }
    public void setParentConnectorHeaderLength(String value) { this.parentConnectorHeaderLength = value; }

    public String getParentConnectorLineLength() { return parentConnectorLineLength; }
    public void setParentConnectorLineLength(String value) { this.parentConnectorLineLength = value; }

    public String getPresentationOption() { return presentationOption; }
    public void setPresentationOption(String value) { this.presentationOption = value; }

    public String getPrimitiveShapeType() { return primitiveShapeType; }
    public void setPrimitiveShapeType(String value) { this.primitiveShapeType = value; }

    public String getRequestDefaultSize() { return requestDefaultSize; }
    public void setRequestDefaultSize(String value) { this.requestDefaultSize = value; }

    public String getRequestFitSize() { return requestFitSize; }
    public void setRequestFitSize(String value) { this.requestFitSize = value; }

    public String getRequestFitSizeFromCenter() { return requestFitSizeFromCenter; }
    public void setRequestFitSizeFromCenter(String value) { this.requestFitSizeFromCenter = value; }

    public String getRequestResetCaption() { return requestResetCaption; }
    public void setRequestResetCaption(String value) { this.requestResetCaption = value; }

    public String getRequestResetCaptionFitWidth() { return requestResetCaptionFitWidth; }
    public void setRequestResetCaptionFitWidth(String value) { this.requestResetCaptionFitWidth = value; }

    public String getRequestResetCaptionSize() { return requestResetCaptionSize; }
    public void setRequestResetCaptionSize(String value) { this.requestResetCaptionSize = value; }

    public String getRequestSetSizeOption() { return requestSetSizeOption; }
    public void setRequestSetSizeOption(String value) { this.requestSetSizeOption = value; }

    public String getSelectable() { return selectable; }
    public void setSelectable(String value) { this.selectable = value; }

    public String getShowAllocatedFrom() { return showAllocatedFrom; }
    public void setShowAllocatedFrom(String value) { this.showAllocatedFrom = value; }

    public String getShowAllocatedTo() { return showAllocatedTo; }
    public void setShowAllocatedTo(String value) { this.showAllocatedTo = value; }

    public String getShowStereotypeIconName() { return showStereotypeIconName; }
    public void setShowStereotypeIconName(String value) { this.showStereotypeIconName = value; }

    public String getWidth() { return width; }
    public void setWidth(String value) { this.width = value; }

    public String getX() { return x; }
    public void setX(String value) { this.x = value; }

    public String getY() { return y; }
    public void setY(String value) { this.y = value; }

    public String getZOrder() { return zOrder; }
    public void setZOrder(String value) { this.zOrder = value; }

    public String getParentFrame() { return parentFrame; }
    public void setParentFrame(String value) { this.parentFrame = value; }

    public String getShowClassifier() { return showClassifier; }
    public void setShowClassifier(String value) { this.showClassifier = value; }
}

// Background.java

package io.codebeautify;

import java.io.IOException;

public enum Background {
    RGB_122207245;

    public String toValue() {
        switch (this) {
            case RGB_122207245: return "rgb(122, 207, 245)";
        }
        return null;
    }

    public static Background forValue(String value) throws IOException {
        if (value.equals("rgb(122, 207, 245)")) return RGB_122207245;
        throw new IOException("Cannot deserialize Background");
    }
}

// FillColor.java

package io.codebeautify;

public class FillColor {
    private Background color;
    private String style;
    private String transparency;
    private String type;

    public Background getColor() { return color; }
    public void setColor(Background value) { this.color = value; }

    public String getStyle() { return style; }
    public void setStyle(String value) { this.style = value; }

    public String getTransparency() { return transparency; }
    public void setTransparency(String value) { this.transparency = value; }

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }
}

// Models.java

package io.codebeautify;

public class Models {
    private Frame[] dataType;
    private Frame frame;
    private Frame modelRelationshipContainer;

    public Frame[] getDataType() { return dataType; }
    public void setDataType(Frame[] value) { this.dataType = value; }

    public Frame getFrame() { return frame; }
    public void setFrame(Frame value) { this.frame = value; }

    public Frame getModelRelationshipContainer() { return modelRelationshipContainer; }
    public void setModelRelationshipContainer(Frame value) { this.modelRelationshipContainer = value; }
}

// End.java

package io.codebeautify;

public class End {
    private Frame messageEnd;

    public Frame getMessageEnd() { return messageEnd; }
    public void setMessageEnd(Frame value) { this.messageEnd = value; }
}

// ModelChildrenMessage.java

package io.codebeautify;

import java.time.OffsetDateTime;

public class ModelChildrenMessage {
    private End fromEnd;
    private End toEnd;
    private MessageMasterView masterView;
    private String asynchronous;
    private String backlogActivityID;
    private String documentationPlain;
    private String durationHeight;
    private EndModelElement endRelationshipFromMetaModelElement;
    private EndModelElement endRelationshipToMetaModelElement;
    private String fromActivation;
    private String id;
    private String name;
    private Author pmAuthor;
    private OffsetDateTime pmCreateDateTime;
    private OffsetDateTime pmLastModified;
    private String qualityReasonIsNull;
    private String qualityScore;
    private String returnMessage;
    private String sequenceNumber;
    private String toActivation;
    private Type type;
    private String userIDLastNumericValue;
    private String userIDIsNull;
    private ActionType actionType;

    public End getFromEnd() { return fromEnd; }
    public void setFromEnd(End value) { this.fromEnd = value; }

    public End getToEnd() { return toEnd; }
    public void setToEnd(End value) { this.toEnd = value; }

    public MessageMasterView getMasterView() { return masterView; }
    public void setMasterView(MessageMasterView value) { this.masterView = value; }

    public String getAsynchronous() { return asynchronous; }
    public void setAsynchronous(String value) { this.asynchronous = value; }

    public String getBacklogActivityID() { return backlogActivityID; }
    public void setBacklogActivityID(String value) { this.backlogActivityID = value; }

    public String getDocumentationPlain() { return documentationPlain; }
    public void setDocumentationPlain(String value) { this.documentationPlain = value; }

    public String getDurationHeight() { return durationHeight; }
    public void setDurationHeight(String value) { this.durationHeight = value; }

    public EndModelElement getEndRelationshipFromMetaModelElement() { return endRelationshipFromMetaModelElement; }
    public void setEndRelationshipFromMetaModelElement(EndModelElement value) { this.endRelationshipFromMetaModelElement = value; }

    public EndModelElement getEndRelationshipToMetaModelElement() { return endRelationshipToMetaModelElement; }
    public void setEndRelationshipToMetaModelElement(EndModelElement value) { this.endRelationshipToMetaModelElement = value; }

    public String getFromActivation() { return fromActivation; }
    public void setFromActivation(String value) { this.fromActivation = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public Author getPmAuthor() { return pmAuthor; }
    public void setPmAuthor(Author value) { this.pmAuthor = value; }

    public OffsetDateTime getPmCreateDateTime() { return pmCreateDateTime; }
    public void setPmCreateDateTime(OffsetDateTime value) { this.pmCreateDateTime = value; }

    public OffsetDateTime getPmLastModified() { return pmLastModified; }
    public void setPmLastModified(OffsetDateTime value) { this.pmLastModified = value; }

    public String getQualityReasonIsNull() { return qualityReasonIsNull; }
    public void setQualityReasonIsNull(String value) { this.qualityReasonIsNull = value; }

    public String getQualityScore() { return qualityScore; }
    public void setQualityScore(String value) { this.qualityScore = value; }

    public String getReturnMessage() { return returnMessage; }
    public void setReturnMessage(String value) { this.returnMessage = value; }

    public String getSequenceNumber() { return sequenceNumber; }
    public void setSequenceNumber(String value) { this.sequenceNumber = value; }

    public String getToActivation() { return toActivation; }
    public void setToActivation(String value) { this.toActivation = value; }

    public Type getType() { return type; }
    public void setType(Type value) { this.type = value; }

    public String getUserIDLastNumericValue() { return userIDLastNumericValue; }
    public void setUserIDLastNumericValue(String value) { this.userIDLastNumericValue = value; }

    public String getUserIDIsNull() { return userIDIsNull; }
    public void setUserIDIsNull(String value) { this.userIDIsNull = value; }

    public ActionType getActionType() { return actionType; }
    public void setActionType(ActionType value) { this.actionType = value; }
}

// Activation.java

package io.codebeautify;

import java.io.IOException;

public class Activation {
    public Frame[] frameArrayValue;
    public Frame frameValue;
}

// Activations.java

package io.codebeautify;

public class Activations {
    private Activation activation;

    public Activation getActivation() { return activation; }
    public void setActivation(Activation value) { this.activation = value; }
}

// InteractionLifeLine.java

package io.codebeautify;

import java.time.OffsetDateTime;

public class InteractionLifeLine {
    private Activations activations;
    private InteractionLifeLineMasterView masterView;
    private String active;
    private String backlogActivityID;
    private String interactionLifeLineClass;
    private String classLevelStereotype;
    private String documentationPlain;
    private EndModelElement id;
    private String multiObject;
    private String multiplicity;
    private String name;
    private Author pmAuthor;
    private OffsetDateTime pmCreateDateTime;
    private OffsetDateTime pmLastModified;
    private String qualityReasonIsNull;
    private String qualityScore;
    private String stopped;
    private String userIDLastNumericValue;
    private String userIDIsNull;

    public Activations getActivations() { return activations; }
    public void setActivations(Activations value) { this.activations = value; }

    public InteractionLifeLineMasterView getMasterView() { return masterView; }
    public void setMasterView(InteractionLifeLineMasterView value) { this.masterView = value; }

    public String getActive() { return active; }
    public void setActive(String value) { this.active = value; }

    public String getBacklogActivityID() { return backlogActivityID; }
    public void setBacklogActivityID(String value) { this.backlogActivityID = value; }

    public String getInteractionLifeLineClass() { return interactionLifeLineClass; }
    public void setInteractionLifeLineClass(String value) { this.interactionLifeLineClass = value; }

    public String getClassLevelStereotype() { return classLevelStereotype; }
    public void setClassLevelStereotype(String value) { this.classLevelStereotype = value; }

    public String getDocumentationPlain() { return documentationPlain; }
    public void setDocumentationPlain(String value) { this.documentationPlain = value; }

    public EndModelElement getID() { return id; }
    public void setID(EndModelElement value) { this.id = value; }

    public String getMultiObject() { return multiObject; }
    public void setMultiObject(String value) { this.multiObject = value; }

    public String getMultiplicity() { return multiplicity; }
    public void setMultiplicity(String value) { this.multiplicity = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public Author getPmAuthor() { return pmAuthor; }
    public void setPmAuthor(Author value) { this.pmAuthor = value; }

    public OffsetDateTime getPmCreateDateTime() { return pmCreateDateTime; }
    public void setPmCreateDateTime(OffsetDateTime value) { this.pmCreateDateTime = value; }

    public OffsetDateTime getPmLastModified() { return pmLastModified; }
    public void setPmLastModified(OffsetDateTime value) { this.pmLastModified = value; }

    public String getQualityReasonIsNull() { return qualityReasonIsNull; }
    public void setQualityReasonIsNull(String value) { this.qualityReasonIsNull = value; }

    public String getQualityScore() { return qualityScore; }
    public void setQualityScore(String value) { this.qualityScore = value; }

    public String getStopped() { return stopped; }
    public void setStopped(String value) { this.stopped = value; }

    public String getUserIDLastNumericValue() { return userIDLastNumericValue; }
    public void setUserIDLastNumericValue(String value) { this.userIDLastNumericValue = value; }

    public String getUserIDIsNull() { return userIDIsNull; }
    public void setUserIDIsNull(String value) { this.userIDIsNull = value; }
}

// ModelChildren.java

package io.codebeautify;

public class ModelChildren {
    private InteractionLifeLine[] interactionLifeLine;
    private Frame modelRelationshipContainer;
    private ModelChildrenMessage[] message;

    public InteractionLifeLine[] getInteractionLifeLine() { return interactionLifeLine; }
    public void setInteractionLifeLine(InteractionLifeLine[] value) { this.interactionLifeLine = value; }

    public Frame getModelRelationshipContainer() { return modelRelationshipContainer; }
    public void setModelRelationshipContainer(Frame value) { this.modelRelationshipContainer = value; }

    public ModelChildrenMessage[] getMessage() { return message; }
    public void setMessage(ModelChildrenMessage[] value) { this.message = value; }
}

// Frame.java

package io.codebeautify;

import java.time.OffsetDateTime;

public class Frame {
    private String backlogActivityID;
    private String documentationPlain;
    private String id;
    private String name;
    private Author pmAuthor;
    private OffsetDateTime pmCreateDateTime;
    private OffsetDateTime pmLastModified;
    private String qualityReasonIsNull;
    private String qualityScore;
    private String userIDLastNumericValue;
    private String userIDIsNull;
    private ModelChildren modelChildren;
    private String baseY;
    private String type;
    private FrameMasterView masterView;
    private String overlappingExecutionOccurrence;
    private String pmLastModifiedIsNull;
    private EndModelElement endModelElement;

    public String getBacklogActivityID() { return backlogActivityID; }
    public void setBacklogActivityID(String value) { this.backlogActivityID = value; }

    public String getDocumentationPlain() { return documentationPlain; }
    public void setDocumentationPlain(String value) { this.documentationPlain = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public Author getPmAuthor() { return pmAuthor; }
    public void setPmAuthor(Author value) { this.pmAuthor = value; }

    public OffsetDateTime getPmCreateDateTime() { return pmCreateDateTime; }
    public void setPmCreateDateTime(OffsetDateTime value) { this.pmCreateDateTime = value; }

    public OffsetDateTime getPmLastModified() { return pmLastModified; }
    public void setPmLastModified(OffsetDateTime value) { this.pmLastModified = value; }

    public String getQualityReasonIsNull() { return qualityReasonIsNull; }
    public void setQualityReasonIsNull(String value) { this.qualityReasonIsNull = value; }

    public String getQualityScore() { return qualityScore; }
    public void setQualityScore(String value) { this.qualityScore = value; }

    public String getUserIDLastNumericValue() { return userIDLastNumericValue; }
    public void setUserIDLastNumericValue(String value) { this.userIDLastNumericValue = value; }

    public String getUserIDIsNull() { return userIDIsNull; }
    public void setUserIDIsNull(String value) { this.userIDIsNull = value; }

    public ModelChildren getModelChildren() { return modelChildren; }
    public void setModelChildren(ModelChildren value) { this.modelChildren = value; }

    public String getBaseY() { return baseY; }
    public void setBaseY(String value) { this.baseY = value; }

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }

    public FrameMasterView getMasterView() { return masterView; }
    public void setMasterView(FrameMasterView value) { this.masterView = value; }

    public String getOverlappingExecutionOccurrence() { return overlappingExecutionOccurrence; }
    public void setOverlappingExecutionOccurrence(String value) { this.overlappingExecutionOccurrence = value; }

    public String getPmLastModifiedIsNull() { return pmLastModifiedIsNull; }
    public void setPmLastModifiedIsNull(String value) { this.pmLastModifiedIsNull = value; }

    public EndModelElement getEndModelElement() { return endModelElement; }
    public void setEndModelElement(EndModelElement value) { this.endModelElement = value; }
}

// ActionType.java

package io.codebeautify;

public class ActionType {
    private ActionTypeReturnClass actionTypeReturn;
    private ActionTypeReturnClass actionTypeSend;

    public ActionTypeReturnClass getActionTypeReturn() { return actionTypeReturn; }
    public void setActionTypeReturn(ActionTypeReturnClass value) { this.actionTypeReturn = value; }

    public ActionTypeReturnClass getActionTypeSend() { return actionTypeSend; }
    public void setActionTypeSend(ActionTypeReturnClass value) { this.actionTypeSend = value; }
}

// ActionTypeReturnClass.java

package io.codebeautify;

import java.time.OffsetDateTime;

public class ActionTypeReturnClass {
    private String asynchronous;
    private String backlogActivityID;
    private String documentationPlain;
    private String id;
    private String iteration;
    private Name name;
    private Author pmAuthor;
    private OffsetDateTime pmCreateDateTime;
    private String pmLastModifiedIsNull;
    private String qualityReasonIsNull;
    private String qualityScore;
    private String recurrenceConditionIsNull;
    private String scriptIsNull;
    private String userIDLastNumericValue;
    private String userIDIsNull;
    private String targetIsNull;

    public String getAsynchronous() { return asynchronous; }
    public void setAsynchronous(String value) { this.asynchronous = value; }

    public String getBacklogActivityID() { return backlogActivityID; }
    public void setBacklogActivityID(String value) { this.backlogActivityID = value; }

    public String getDocumentationPlain() { return documentationPlain; }
    public void setDocumentationPlain(String value) { this.documentationPlain = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public String getIteration() { return iteration; }
    public void setIteration(String value) { this.iteration = value; }

    public Name getName() { return name; }
    public void setName(Name value) { this.name = value; }

    public Author getPmAuthor() { return pmAuthor; }
    public void setPmAuthor(Author value) { this.pmAuthor = value; }

    public OffsetDateTime getPmCreateDateTime() { return pmCreateDateTime; }
    public void setPmCreateDateTime(OffsetDateTime value) { this.pmCreateDateTime = value; }

    public String getPmLastModifiedIsNull() { return pmLastModifiedIsNull; }
    public void setPmLastModifiedIsNull(String value) { this.pmLastModifiedIsNull = value; }

    public String getQualityReasonIsNull() { return qualityReasonIsNull; }
    public void setQualityReasonIsNull(String value) { this.qualityReasonIsNull = value; }

    public String getQualityScore() { return qualityScore; }
    public void setQualityScore(String value) { this.qualityScore = value; }

    public String getRecurrenceConditionIsNull() { return recurrenceConditionIsNull; }
    public void setRecurrenceConditionIsNull(String value) { this.recurrenceConditionIsNull = value; }

    public String getScriptIsNull() { return scriptIsNull; }
    public void setScriptIsNull(String value) { this.scriptIsNull = value; }

    public String getUserIDLastNumericValue() { return userIDLastNumericValue; }
    public void setUserIDLastNumericValue(String value) { this.userIDLastNumericValue = value; }

    public String getUserIDIsNull() { return userIDIsNull; }
    public void setUserIDIsNull(String value) { this.userIDIsNull = value; }

    public String getTargetIsNull() { return targetIsNull; }
    public void setTargetIsNull(String value) { this.targetIsNull = value; }
}

// Name.java

package io.codebeautify;

import java.io.IOException;

public enum Name {
    RETURN, SEND;

    public String toValue() {
        switch (this) {
            case RETURN: return "Return";
            case SEND: return "Send";
        }
        return null;
    }

    public static Name forValue(String value) throws IOException {
        if (value.equals("Return")) return RETURN;
        if (value.equals("Send")) return SEND;
        throw new IOException("Cannot deserialize Name");
    }
}

// EndModelElement.java

package io.codebeautify;

import java.io.IOException;

public enum EndModelElement {
    D_G1_A_CE6_G_AQ_BW_AQ_WU, F_YL_A_CE6_G_AQ_BW_AQ_WL, M_KD_A_CE6_G_AQ_BW_AQW3, S_XZ_A_CE6_G_AQ_BW_AQXJ, YFDA_CE6_G_AQ_BW_AQXA;

    public String toValue() {
        switch (this) {
            case D_G1_A_CE6_G_AQ_BW_AQ_WU: return "dG1ACe6GAqBwAQWu";
            case F_YL_A_CE6_G_AQ_BW_AQ_WL: return "FYlACe6GAqBwAQWl";
            case M_KD_A_CE6_G_AQ_BW_AQW3: return "MKdACe6GAqBwAQW3";
            case S_XZ_A_CE6_G_AQ_BW_AQXJ: return "SXzACe6GAqBwAQXJ";
            case YFDA_CE6_G_AQ_BW_AQXA: return "YFDACe6GAqBwAQXA";
        }
        return null;
    }

    public static EndModelElement forValue(String value) throws IOException {
        if (value.equals("dG1ACe6GAqBwAQWu")) return D_G1_A_CE6_G_AQ_BW_AQ_WU;
        if (value.equals("FYlACe6GAqBwAQWl")) return F_YL_A_CE6_G_AQ_BW_AQ_WL;
        if (value.equals("MKdACe6GAqBwAQW3")) return M_KD_A_CE6_G_AQ_BW_AQW3;
        if (value.equals("SXzACe6GAqBwAQXJ")) return S_XZ_A_CE6_G_AQ_BW_AQXJ;
        if (value.equals("YFDACe6GAqBwAQXA")) return YFDA_CE6_G_AQ_BW_AQXA;
        throw new IOException("Cannot deserialize EndModelElement");
    }
}

// MessageMasterView.java

package io.codebeautify;

public class MessageMasterView {
    private MessageClass message;

    public MessageClass getMessage() { return message; }
    public void setMessage(MessageClass value) { this.message = value; }
}

// MessageClass.java

package io.codebeautify;

public class MessageClass {
    private String idref;
    private String name;

    public String getIdref() { return idref; }
    public void setIdref(String value) { this.idref = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }
}

// Type.java

package io.codebeautify;

import java.io.IOException;

public enum Type {
    MESSAGE;

    public String toValue() {
        switch (this) {
            case MESSAGE: return "Message";
        }
        return null;
    }

    public static Type forValue(String value) throws IOException {
        if (value.equals("Message")) return MESSAGE;
        throw new IOException("Cannot deserialize Type");
    }
}

// InteractionLifeLineMasterView.java

package io.codebeautify;

public class InteractionLifeLineMasterView {
    private MessageClass interactionLifeLine;

    public MessageClass getInteractionLifeLine() { return interactionLifeLine; }
    public void setInteractionLifeLine(MessageClass value) { this.interactionLifeLine = value; }
}

// FrameMasterView.java

package io.codebeautify;

public class FrameMasterView {
    private MessageClass activation;

    public MessageClass getActivation() { return activation; }
    public void setActivation(MessageClass value) { this.activation = value; }
}

// ProjectInfo.java

package io.codebeautify;

public class ProjectInfo {
    private String logicalView;
    private ProjectOptions projectOptions;

    public String getLogicalView() { return logicalView; }
    public void setLogicalView(String value) { this.logicalView = value; }

    public ProjectOptions getProjectOptions() { return projectOptions; }
    public void setProjectOptions(ProjectOptions value) { this.projectOptions = value; }
}

// ProjectOptions.java

package io.codebeautify;

public class ProjectOptions {
    private DiagramOptions diagramOptions;
    private GeneralOptions generalOptions;
    private InstantReverseOptions instantReverseOptions;
    private ModelQualityOptions modelQualityOptions;
    private ORMOptions ormOptions;
    private RequirementDiagramOptions requirementDiagramOptions;
    private StateCodeEngineOptions stateCodeEngineOptions;
    private WarningOptions warningOptions;
    private PORepository poRepository;

    public DiagramOptions getDiagramOptions() { return diagramOptions; }
    public void setDiagramOptions(DiagramOptions value) { this.diagramOptions = value; }

    public GeneralOptions getGeneralOptions() { return generalOptions; }
    public void setGeneralOptions(GeneralOptions value) { this.generalOptions = value; }

    public InstantReverseOptions getInstantReverseOptions() { return instantReverseOptions; }
    public void setInstantReverseOptions(InstantReverseOptions value) { this.instantReverseOptions = value; }

    public ModelQualityOptions getModelQualityOptions() { return modelQualityOptions; }
    public void setModelQualityOptions(ModelQualityOptions value) { this.modelQualityOptions = value; }

    public ORMOptions getORMOptions() { return ormOptions; }
    public void setORMOptions(ORMOptions value) { this.ormOptions = value; }

    public RequirementDiagramOptions getRequirementDiagramOptions() { return requirementDiagramOptions; }
    public void setRequirementDiagramOptions(RequirementDiagramOptions value) { this.requirementDiagramOptions = value; }

    public StateCodeEngineOptions getStateCodeEngineOptions() { return stateCodeEngineOptions; }
    public void setStateCodeEngineOptions(StateCodeEngineOptions value) { this.stateCodeEngineOptions = value; }

    public WarningOptions getWarningOptions() { return warningOptions; }
    public void setWarningOptions(WarningOptions value) { this.warningOptions = value; }

    public PORepository getPoRepository() { return poRepository; }
    public void setPoRepository(PORepository value) { this.poRepository = value; }
}

// DiagramOptions.java

package io.codebeautify;

public class DiagramOptions {
    private DefaultHTMLDocFont defaultHTMLDocFont;
    private String activityDiagramControlFlowDisplayOption;
    private String activityDiagramShowActionCallBehaviorOption;
    private String activityDiagramShowActivityEdgeWeight;
    private String activityDiagramShowObjectNodeType;
    private String activityDiagramShowPartitionHandle;
    private String addDataStoresEXTEntitiesToDecomposedDFD;
    private String alignColumnProperties;
    private String allowConfigShowInOutFlowButtonsInDataFlowDiagram;
    private String autoGenerateRoleName;
    private String autoSetAttributeType;
    private String autoSetColumnType;
    private String autoSyncRoleName;
    private String bpdAutoStretchPools;
    private String bpdConnectGatewayWithFlowObjectInDifferentPool;
    private String bpdDefaultConnectionPointStyle;
    private String bpdDefaultConnectorStyle;
    private String bpdDhowIDOption;
    private String bpdShowActivitiesTypeIcon;
    private String businessProcessDiagramDefaultLanguage;
    private String classVisibilityStyle;
    private String connectorLabelOrientation;
    private String createOneMessagePerDirection;
    private String decisionMergeNodeConnectionPointStyle;
    private String defaultAssociationEndNavigable;
    private String defaultAssociationEndVisibility;
    private String defaultAssociationShowFromMultiplicity;
    private String defaultAssociationShowFromRoleName;
    private String defaultAssociationShowFromRoleVisibility;
    private String defaultAssociationShowStereotypes;
    private String defaultAssociationShowToMultiplicity;
    private String defaultAssociationShowToRoleName;
    private String defaultAssociationShowToRoleVisibility;
    private String defaultAttributeMultiplicity;
    private String defaultAttributeType;
    private String defaultAttributeVisibility;
    private String defaultClassAttributeMultiplicity;
    private String defaultClassAttributeMultiplicityOrdered;
    private String defaultClassAttributeMultiplicityUnique;
    private String defaultClassInterfaceBall;
    private String defaultClassVisibility;
    private String defaultColumnType;
    private String defaultConnectionPointStyle;
    private String defaultConnectorStyle;
    private String defaultDiagramBackground;
    private String defaultDisplayAsRobustnessAnalysisIcon;
    private String defaultDisplayAsRobustnessAnalysisIconInSequenceDiagram;
    private String defaultDisplayAsStereotypeIcon;
    private DefaultFontColor defaultFontColor;
    private String defaultGenDiagramTypeFromScenario;
    private DefaultFontColor defaultHTMLDocFontColor;
    private String defaultLineJumps;
    private String defaultOperationVisibility;
    private String defaultParameterDirection;
    private String defaultShowAttributeInitialValue;
    private String defaultShowAttributeOption;
    private String defaultShowClassMemberStereotype;
    private String defaultShowDirection;
    private String defaultShowMultiplicityConstraints;
    private String defaultShowOperationOption;
    private String defaultShowOperationSignature;
    private String defaultShowOrderedMultiplicityConstraint;
    private String defaultShowOwnedAssociationEndAsAttribute;
    private String defaultShowOwner;
    private String defaultShowOwnerSkipModelInFullyQualifiedOwnerSignature;
    private String defaultShowReceptionOption;
    private String defaultShowTemplateParameter;
    private String defaultShowTypeOption;
    private String defaultShowUniqueMultiplicityConstraint;
    private String defaultTypeOfSubProcess;
    private String defaultWrapClassMember;
    private String drawTextAnnotationOpenRectangleFollowConnectorEnd;
    private String enableMinimumSize;
    private String entityColumnConstraintsPresentation;
    private String erdIndexNumOfDigits;
    private String erdIndexPattern;
    private String erdIndexPatternSyncAutomatically;
    private String erdManyToManyJoinTableDelimiter;
    private String etlTableDiagramFontSize;
    private String expandedSubProcessDiagramContent;
    private String foreignKeyArrowHeadSize;
    private String foreignKeyConnectorEndPointAssociatedColumn;
    private String foreignKeyNamePattern;
    private String foreignKeyNamePatternCaseHandling;
    private String foreignKeyRelationshipPattern;
    private String fractionalMetrics;
    private String generalizationSetNotation;
    private String graphicAntiAliasing;
    private String gridDiagramFontSize;
    private String lineJumpSize;
    private String modelElementNameAlignment;
    private String multipleLineClassName;
    private String paintConnectorThroughLabel;
    private String pointConnectorEndToCompartmentMember;
    private String primaryKeyConstraintPattern;
    private String primaryKeyNamePattern;
    private String renameConstructorAfterRenameClass;
    private String renameExtensionPointToFollowExtendUseCase;
    private String shapeAutoFitSize;
    private String showActivationsInSequenceDiagram;
    private String showActivityStateNodeCaption;
    private String showArtifactOption;
    private String showAssociatedDiagramNameOfInteraction;
    private String showAssociationRoleStereotypes;
    private String showAttributeGetterSetter;
    private String showBSElementCode;
    private String showClassEmptyCompartments;
    private String showColumnDefaultValue;
    private String showColumnNullable;
    private String showColumnType;
    private String showColumnUniqueConstraintName;
    private String showColumnUserType;
    private String showComponentOption;
    private String showExtraColumnProperties;
    private String showInOutFlowButtonsInDataFlowDiagram;
    private String showInOutFlowsInSubLevelDiagram;
    private String showMessageOperationSignatureForSequenceAndCommunicationDiagram;
    private String showMessageStereotypeInSequenceAndCommunicationDiagram;
    private String showNumberInCollaborationDiagram;
    private String showNumberInSequenceDiagram;
    private String showPackageNameStyle;
    private String showParameterNameInOperationSignature;
    private String showRowGridLineWithinCompClassDiagram;
    private String showRowGridLineWithinCompERD;
    private String showRowGridLineWithinORMDiagram;
    private String showSchemaNameInERD;
    private String showTransitionTrigger;
    private String showUseCaseExtensionPoint;
    private String showUseCaseID;
    private String snapConnectorsAfterZoom;
    private String stateShowParametersOfInternalActivities;
    private String stateShowPrePostConditionAndBodyOfInternalActivities;
    private String stopTargetLifelineOnCreateDestroyMessage;
    private String supportHTMLTaggedValue;
    private String supportMultipleLineAttribute;
    private String suppressImpliedMultiplicityForAttributeAssociationEnd;
    private String syncAssociationNameWithAssociationClass;
    private String syncAssociationRoleNameWithReferencedAttributeName;
    private String syncDocOfInterfaceToSubClass;
    private String textAntiAliasing;
    private String textualAnalysisGenerateRequirementTextOption;
    private String textualAnalysisHighlightOption;
    private String unnamedIndexPattern;
    private String useStateNameTab;
    private String wireflowDiagramDevice;
    private String wireflowDiagramShowActiveFlowLabel;
    private String wireflowDiagramTheme;
    private String wireflowDiagramWireflowShowPreview;
    private String wireflowDiagramWireflowShowScreenID;

    public DefaultHTMLDocFont getDefaultHTMLDocFont() { return defaultHTMLDocFont; }
    public void setDefaultHTMLDocFont(DefaultHTMLDocFont value) { this.defaultHTMLDocFont = value; }

    public String getActivityDiagramControlFlowDisplayOption() { return activityDiagramControlFlowDisplayOption; }
    public void setActivityDiagramControlFlowDisplayOption(String value) { this.activityDiagramControlFlowDisplayOption = value; }

    public String getActivityDiagramShowActionCallBehaviorOption() { return activityDiagramShowActionCallBehaviorOption; }
    public void setActivityDiagramShowActionCallBehaviorOption(String value) { this.activityDiagramShowActionCallBehaviorOption = value; }

    public String getActivityDiagramShowActivityEdgeWeight() { return activityDiagramShowActivityEdgeWeight; }
    public void setActivityDiagramShowActivityEdgeWeight(String value) { this.activityDiagramShowActivityEdgeWeight = value; }

    public String getActivityDiagramShowObjectNodeType() { return activityDiagramShowObjectNodeType; }
    public void setActivityDiagramShowObjectNodeType(String value) { this.activityDiagramShowObjectNodeType = value; }

    public String getActivityDiagramShowPartitionHandle() { return activityDiagramShowPartitionHandle; }
    public void setActivityDiagramShowPartitionHandle(String value) { this.activityDiagramShowPartitionHandle = value; }

    public String getAddDataStoresEXTEntitiesToDecomposedDFD() { return addDataStoresEXTEntitiesToDecomposedDFD; }
    public void setAddDataStoresEXTEntitiesToDecomposedDFD(String value) { this.addDataStoresEXTEntitiesToDecomposedDFD = value; }

    public String getAlignColumnProperties() { return alignColumnProperties; }
    public void setAlignColumnProperties(String value) { this.alignColumnProperties = value; }

    public String getAllowConfigShowInOutFlowButtonsInDataFlowDiagram() { return allowConfigShowInOutFlowButtonsInDataFlowDiagram; }
    public void setAllowConfigShowInOutFlowButtonsInDataFlowDiagram(String value) { this.allowConfigShowInOutFlowButtonsInDataFlowDiagram = value; }

    public String getAutoGenerateRoleName() { return autoGenerateRoleName; }
    public void setAutoGenerateRoleName(String value) { this.autoGenerateRoleName = value; }

    public String getAutoSetAttributeType() { return autoSetAttributeType; }
    public void setAutoSetAttributeType(String value) { this.autoSetAttributeType = value; }

    public String getAutoSetColumnType() { return autoSetColumnType; }
    public void setAutoSetColumnType(String value) { this.autoSetColumnType = value; }

    public String getAutoSyncRoleName() { return autoSyncRoleName; }
    public void setAutoSyncRoleName(String value) { this.autoSyncRoleName = value; }

    public String getBpdAutoStretchPools() { return bpdAutoStretchPools; }
    public void setBpdAutoStretchPools(String value) { this.bpdAutoStretchPools = value; }

    public String getBpdConnectGatewayWithFlowObjectInDifferentPool() { return bpdConnectGatewayWithFlowObjectInDifferentPool; }
    public void setBpdConnectGatewayWithFlowObjectInDifferentPool(String value) { this.bpdConnectGatewayWithFlowObjectInDifferentPool = value; }

    public String getBpdDefaultConnectionPointStyle() { return bpdDefaultConnectionPointStyle; }
    public void setBpdDefaultConnectionPointStyle(String value) { this.bpdDefaultConnectionPointStyle = value; }

    public String getBpdDefaultConnectorStyle() { return bpdDefaultConnectorStyle; }
    public void setBpdDefaultConnectorStyle(String value) { this.bpdDefaultConnectorStyle = value; }

    public String getBpdDhowIDOption() { return bpdDhowIDOption; }
    public void setBpdDhowIDOption(String value) { this.bpdDhowIDOption = value; }

    public String getBpdShowActivitiesTypeIcon() { return bpdShowActivitiesTypeIcon; }
    public void setBpdShowActivitiesTypeIcon(String value) { this.bpdShowActivitiesTypeIcon = value; }

    public String getBusinessProcessDiagramDefaultLanguage() { return businessProcessDiagramDefaultLanguage; }
    public void setBusinessProcessDiagramDefaultLanguage(String value) { this.businessProcessDiagramDefaultLanguage = value; }

    public String getClassVisibilityStyle() { return classVisibilityStyle; }
    public void setClassVisibilityStyle(String value) { this.classVisibilityStyle = value; }

    public String getConnectorLabelOrientation() { return connectorLabelOrientation; }
    public void setConnectorLabelOrientation(String value) { this.connectorLabelOrientation = value; }

    public String getCreateOneMessagePerDirection() { return createOneMessagePerDirection; }
    public void setCreateOneMessagePerDirection(String value) { this.createOneMessagePerDirection = value; }

    public String getDecisionMergeNodeConnectionPointStyle() { return decisionMergeNodeConnectionPointStyle; }
    public void setDecisionMergeNodeConnectionPointStyle(String value) { this.decisionMergeNodeConnectionPointStyle = value; }

    public String getDefaultAssociationEndNavigable() { return defaultAssociationEndNavigable; }
    public void setDefaultAssociationEndNavigable(String value) { this.defaultAssociationEndNavigable = value; }

    public String getDefaultAssociationEndVisibility() { return defaultAssociationEndVisibility; }
    public void setDefaultAssociationEndVisibility(String value) { this.defaultAssociationEndVisibility = value; }

    public String getDefaultAssociationShowFromMultiplicity() { return defaultAssociationShowFromMultiplicity; }
    public void setDefaultAssociationShowFromMultiplicity(String value) { this.defaultAssociationShowFromMultiplicity = value; }

    public String getDefaultAssociationShowFromRoleName() { return defaultAssociationShowFromRoleName; }
    public void setDefaultAssociationShowFromRoleName(String value) { this.defaultAssociationShowFromRoleName = value; }

    public String getDefaultAssociationShowFromRoleVisibility() { return defaultAssociationShowFromRoleVisibility; }
    public void setDefaultAssociationShowFromRoleVisibility(String value) { this.defaultAssociationShowFromRoleVisibility = value; }

    public String getDefaultAssociationShowStereotypes() { return defaultAssociationShowStereotypes; }
    public void setDefaultAssociationShowStereotypes(String value) { this.defaultAssociationShowStereotypes = value; }

    public String getDefaultAssociationShowToMultiplicity() { return defaultAssociationShowToMultiplicity; }
    public void setDefaultAssociationShowToMultiplicity(String value) { this.defaultAssociationShowToMultiplicity = value; }

    public String getDefaultAssociationShowToRoleName() { return defaultAssociationShowToRoleName; }
    public void setDefaultAssociationShowToRoleName(String value) { this.defaultAssociationShowToRoleName = value; }

    public String getDefaultAssociationShowToRoleVisibility() { return defaultAssociationShowToRoleVisibility; }
    public void setDefaultAssociationShowToRoleVisibility(String value) { this.defaultAssociationShowToRoleVisibility = value; }

    public String getDefaultAttributeMultiplicity() { return defaultAttributeMultiplicity; }
    public void setDefaultAttributeMultiplicity(String value) { this.defaultAttributeMultiplicity = value; }

    public String getDefaultAttributeType() { return defaultAttributeType; }
    public void setDefaultAttributeType(String value) { this.defaultAttributeType = value; }

    public String getDefaultAttributeVisibility() { return defaultAttributeVisibility; }
    public void setDefaultAttributeVisibility(String value) { this.defaultAttributeVisibility = value; }

    public String getDefaultClassAttributeMultiplicity() { return defaultClassAttributeMultiplicity; }
    public void setDefaultClassAttributeMultiplicity(String value) { this.defaultClassAttributeMultiplicity = value; }

    public String getDefaultClassAttributeMultiplicityOrdered() { return defaultClassAttributeMultiplicityOrdered; }
    public void setDefaultClassAttributeMultiplicityOrdered(String value) { this.defaultClassAttributeMultiplicityOrdered = value; }

    public String getDefaultClassAttributeMultiplicityUnique() { return defaultClassAttributeMultiplicityUnique; }
    public void setDefaultClassAttributeMultiplicityUnique(String value) { this.defaultClassAttributeMultiplicityUnique = value; }

    public String getDefaultClassInterfaceBall() { return defaultClassInterfaceBall; }
    public void setDefaultClassInterfaceBall(String value) { this.defaultClassInterfaceBall = value; }

    public String getDefaultClassVisibility() { return defaultClassVisibility; }
    public void setDefaultClassVisibility(String value) { this.defaultClassVisibility = value; }

    public String getDefaultColumnType() { return defaultColumnType; }
    public void setDefaultColumnType(String value) { this.defaultColumnType = value; }

    public String getDefaultConnectionPointStyle() { return defaultConnectionPointStyle; }
    public void setDefaultConnectionPointStyle(String value) { this.defaultConnectionPointStyle = value; }

    public String getDefaultConnectorStyle() { return defaultConnectorStyle; }
    public void setDefaultConnectorStyle(String value) { this.defaultConnectorStyle = value; }

    public String getDefaultDiagramBackground() { return defaultDiagramBackground; }
    public void setDefaultDiagramBackground(String value) { this.defaultDiagramBackground = value; }

    public String getDefaultDisplayAsRobustnessAnalysisIcon() { return defaultDisplayAsRobustnessAnalysisIcon; }
    public void setDefaultDisplayAsRobustnessAnalysisIcon(String value) { this.defaultDisplayAsRobustnessAnalysisIcon = value; }

    public String getDefaultDisplayAsRobustnessAnalysisIconInSequenceDiagram() { return defaultDisplayAsRobustnessAnalysisIconInSequenceDiagram; }
    public void setDefaultDisplayAsRobustnessAnalysisIconInSequenceDiagram(String value) { this.defaultDisplayAsRobustnessAnalysisIconInSequenceDiagram = value; }

    public String getDefaultDisplayAsStereotypeIcon() { return defaultDisplayAsStereotypeIcon; }
    public void setDefaultDisplayAsStereotypeIcon(String value) { this.defaultDisplayAsStereotypeIcon = value; }

    public DefaultFontColor getDefaultFontColor() { return defaultFontColor; }
    public void setDefaultFontColor(DefaultFontColor value) { this.defaultFontColor = value; }

    public String getDefaultGenDiagramTypeFromScenario() { return defaultGenDiagramTypeFromScenario; }
    public void setDefaultGenDiagramTypeFromScenario(String value) { this.defaultGenDiagramTypeFromScenario = value; }

    public DefaultFontColor getDefaultHTMLDocFontColor() { return defaultHTMLDocFontColor; }
    public void setDefaultHTMLDocFontColor(DefaultFontColor value) { this.defaultHTMLDocFontColor = value; }

    public String getDefaultLineJumps() { return defaultLineJumps; }
    public void setDefaultLineJumps(String value) { this.defaultLineJumps = value; }

    public String getDefaultOperationVisibility() { return defaultOperationVisibility; }
    public void setDefaultOperationVisibility(String value) { this.defaultOperationVisibility = value; }

    public String getDefaultParameterDirection() { return defaultParameterDirection; }
    public void setDefaultParameterDirection(String value) { this.defaultParameterDirection = value; }

    public String getDefaultShowAttributeInitialValue() { return defaultShowAttributeInitialValue; }
    public void setDefaultShowAttributeInitialValue(String value) { this.defaultShowAttributeInitialValue = value; }

    public String getDefaultShowAttributeOption() { return defaultShowAttributeOption; }
    public void setDefaultShowAttributeOption(String value) { this.defaultShowAttributeOption = value; }

    public String getDefaultShowClassMemberStereotype() { return defaultShowClassMemberStereotype; }
    public void setDefaultShowClassMemberStereotype(String value) { this.defaultShowClassMemberStereotype = value; }

    public String getDefaultShowDirection() { return defaultShowDirection; }
    public void setDefaultShowDirection(String value) { this.defaultShowDirection = value; }

    public String getDefaultShowMultiplicityConstraints() { return defaultShowMultiplicityConstraints; }
    public void setDefaultShowMultiplicityConstraints(String value) { this.defaultShowMultiplicityConstraints = value; }

    public String getDefaultShowOperationOption() { return defaultShowOperationOption; }
    public void setDefaultShowOperationOption(String value) { this.defaultShowOperationOption = value; }

    public String getDefaultShowOperationSignature() { return defaultShowOperationSignature; }
    public void setDefaultShowOperationSignature(String value) { this.defaultShowOperationSignature = value; }

    public String getDefaultShowOrderedMultiplicityConstraint() { return defaultShowOrderedMultiplicityConstraint; }
    public void setDefaultShowOrderedMultiplicityConstraint(String value) { this.defaultShowOrderedMultiplicityConstraint = value; }

    public String getDefaultShowOwnedAssociationEndAsAttribute() { return defaultShowOwnedAssociationEndAsAttribute; }
    public void setDefaultShowOwnedAssociationEndAsAttribute(String value) { this.defaultShowOwnedAssociationEndAsAttribute = value; }

    public String getDefaultShowOwner() { return defaultShowOwner; }
    public void setDefaultShowOwner(String value) { this.defaultShowOwner = value; }

    public String getDefaultShowOwnerSkipModelInFullyQualifiedOwnerSignature() { return defaultShowOwnerSkipModelInFullyQualifiedOwnerSignature; }
    public void setDefaultShowOwnerSkipModelInFullyQualifiedOwnerSignature(String value) { this.defaultShowOwnerSkipModelInFullyQualifiedOwnerSignature = value; }

    public String getDefaultShowReceptionOption() { return defaultShowReceptionOption; }
    public void setDefaultShowReceptionOption(String value) { this.defaultShowReceptionOption = value; }

    public String getDefaultShowTemplateParameter() { return defaultShowTemplateParameter; }
    public void setDefaultShowTemplateParameter(String value) { this.defaultShowTemplateParameter = value; }

    public String getDefaultShowTypeOption() { return defaultShowTypeOption; }
    public void setDefaultShowTypeOption(String value) { this.defaultShowTypeOption = value; }

    public String getDefaultShowUniqueMultiplicityConstraint() { return defaultShowUniqueMultiplicityConstraint; }
    public void setDefaultShowUniqueMultiplicityConstraint(String value) { this.defaultShowUniqueMultiplicityConstraint = value; }

    public String getDefaultTypeOfSubProcess() { return defaultTypeOfSubProcess; }
    public void setDefaultTypeOfSubProcess(String value) { this.defaultTypeOfSubProcess = value; }

    public String getDefaultWrapClassMember() { return defaultWrapClassMember; }
    public void setDefaultWrapClassMember(String value) { this.defaultWrapClassMember = value; }

    public String getDrawTextAnnotationOpenRectangleFollowConnectorEnd() { return drawTextAnnotationOpenRectangleFollowConnectorEnd; }
    public void setDrawTextAnnotationOpenRectangleFollowConnectorEnd(String value) { this.drawTextAnnotationOpenRectangleFollowConnectorEnd = value; }

    public String getEnableMinimumSize() { return enableMinimumSize; }
    public void setEnableMinimumSize(String value) { this.enableMinimumSize = value; }

    public String getEntityColumnConstraintsPresentation() { return entityColumnConstraintsPresentation; }
    public void setEntityColumnConstraintsPresentation(String value) { this.entityColumnConstraintsPresentation = value; }

    public String getERDIndexNumOfDigits() { return erdIndexNumOfDigits; }
    public void setERDIndexNumOfDigits(String value) { this.erdIndexNumOfDigits = value; }

    public String getERDIndexPattern() { return erdIndexPattern; }
    public void setERDIndexPattern(String value) { this.erdIndexPattern = value; }

    public String getERDIndexPatternSyncAutomatically() { return erdIndexPatternSyncAutomatically; }
    public void setERDIndexPatternSyncAutomatically(String value) { this.erdIndexPatternSyncAutomatically = value; }

    public String getERDManyToManyJoinTableDelimiter() { return erdManyToManyJoinTableDelimiter; }
    public void setERDManyToManyJoinTableDelimiter(String value) { this.erdManyToManyJoinTableDelimiter = value; }

    public String getETLTableDiagramFontSize() { return etlTableDiagramFontSize; }
    public void setETLTableDiagramFontSize(String value) { this.etlTableDiagramFontSize = value; }

    public String getExpandedSubProcessDiagramContent() { return expandedSubProcessDiagramContent; }
    public void setExpandedSubProcessDiagramContent(String value) { this.expandedSubProcessDiagramContent = value; }

    public String getForeignKeyArrowHeadSize() { return foreignKeyArrowHeadSize; }
    public void setForeignKeyArrowHeadSize(String value) { this.foreignKeyArrowHeadSize = value; }

    public String getForeignKeyConnectorEndPointAssociatedColumn() { return foreignKeyConnectorEndPointAssociatedColumn; }
    public void setForeignKeyConnectorEndPointAssociatedColumn(String value) { this.foreignKeyConnectorEndPointAssociatedColumn = value; }

    public String getForeignKeyNamePattern() { return foreignKeyNamePattern; }
    public void setForeignKeyNamePattern(String value) { this.foreignKeyNamePattern = value; }

    public String getForeignKeyNamePatternCaseHandling() { return foreignKeyNamePatternCaseHandling; }
    public void setForeignKeyNamePatternCaseHandling(String value) { this.foreignKeyNamePatternCaseHandling = value; }

    public String getForeignKeyRelationshipPattern() { return foreignKeyRelationshipPattern; }
    public void setForeignKeyRelationshipPattern(String value) { this.foreignKeyRelationshipPattern = value; }

    public String getFractionalMetrics() { return fractionalMetrics; }
    public void setFractionalMetrics(String value) { this.fractionalMetrics = value; }

    public String getGeneralizationSetNotation() { return generalizationSetNotation; }
    public void setGeneralizationSetNotation(String value) { this.generalizationSetNotation = value; }

    public String getGraphicAntiAliasing() { return graphicAntiAliasing; }
    public void setGraphicAntiAliasing(String value) { this.graphicAntiAliasing = value; }

    public String getGridDiagramFontSize() { return gridDiagramFontSize; }
    public void setGridDiagramFontSize(String value) { this.gridDiagramFontSize = value; }

    public String getLineJumpSize() { return lineJumpSize; }
    public void setLineJumpSize(String value) { this.lineJumpSize = value; }

    public String getModelElementNameAlignment() { return modelElementNameAlignment; }
    public void setModelElementNameAlignment(String value) { this.modelElementNameAlignment = value; }

    public String getMultipleLineClassName() { return multipleLineClassName; }
    public void setMultipleLineClassName(String value) { this.multipleLineClassName = value; }

    public String getPaintConnectorThroughLabel() { return paintConnectorThroughLabel; }
    public void setPaintConnectorThroughLabel(String value) { this.paintConnectorThroughLabel = value; }

    public String getPointConnectorEndToCompartmentMember() { return pointConnectorEndToCompartmentMember; }
    public void setPointConnectorEndToCompartmentMember(String value) { this.pointConnectorEndToCompartmentMember = value; }

    public String getPrimaryKeyConstraintPattern() { return primaryKeyConstraintPattern; }
    public void setPrimaryKeyConstraintPattern(String value) { this.primaryKeyConstraintPattern = value; }

    public String getPrimaryKeyNamePattern() { return primaryKeyNamePattern; }
    public void setPrimaryKeyNamePattern(String value) { this.primaryKeyNamePattern = value; }

    public String getRenameConstructorAfterRenameClass() { return renameConstructorAfterRenameClass; }
    public void setRenameConstructorAfterRenameClass(String value) { this.renameConstructorAfterRenameClass = value; }

    public String getRenameExtensionPointToFollowExtendUseCase() { return renameExtensionPointToFollowExtendUseCase; }
    public void setRenameExtensionPointToFollowExtendUseCase(String value) { this.renameExtensionPointToFollowExtendUseCase = value; }

    public String getShapeAutoFitSize() { return shapeAutoFitSize; }
    public void setShapeAutoFitSize(String value) { this.shapeAutoFitSize = value; }

    public String getShowActivationsInSequenceDiagram() { return showActivationsInSequenceDiagram; }
    public void setShowActivationsInSequenceDiagram(String value) { this.showActivationsInSequenceDiagram = value; }

    public String getShowActivityStateNodeCaption() { return showActivityStateNodeCaption; }
    public void setShowActivityStateNodeCaption(String value) { this.showActivityStateNodeCaption = value; }

    public String getShowArtifactOption() { return showArtifactOption; }
    public void setShowArtifactOption(String value) { this.showArtifactOption = value; }

    public String getShowAssociatedDiagramNameOfInteraction() { return showAssociatedDiagramNameOfInteraction; }
    public void setShowAssociatedDiagramNameOfInteraction(String value) { this.showAssociatedDiagramNameOfInteraction = value; }

    public String getShowAssociationRoleStereotypes() { return showAssociationRoleStereotypes; }
    public void setShowAssociationRoleStereotypes(String value) { this.showAssociationRoleStereotypes = value; }

    public String getShowAttributeGetterSetter() { return showAttributeGetterSetter; }
    public void setShowAttributeGetterSetter(String value) { this.showAttributeGetterSetter = value; }

    public String getShowBSElementCode() { return showBSElementCode; }
    public void setShowBSElementCode(String value) { this.showBSElementCode = value; }

    public String getShowClassEmptyCompartments() { return showClassEmptyCompartments; }
    public void setShowClassEmptyCompartments(String value) { this.showClassEmptyCompartments = value; }

    public String getShowColumnDefaultValue() { return showColumnDefaultValue; }
    public void setShowColumnDefaultValue(String value) { this.showColumnDefaultValue = value; }

    public String getShowColumnNullable() { return showColumnNullable; }
    public void setShowColumnNullable(String value) { this.showColumnNullable = value; }

    public String getShowColumnType() { return showColumnType; }
    public void setShowColumnType(String value) { this.showColumnType = value; }

    public String getShowColumnUniqueConstraintName() { return showColumnUniqueConstraintName; }
    public void setShowColumnUniqueConstraintName(String value) { this.showColumnUniqueConstraintName = value; }

    public String getShowColumnUserType() { return showColumnUserType; }
    public void setShowColumnUserType(String value) { this.showColumnUserType = value; }

    public String getShowComponentOption() { return showComponentOption; }
    public void setShowComponentOption(String value) { this.showComponentOption = value; }

    public String getShowExtraColumnProperties() { return showExtraColumnProperties; }
    public void setShowExtraColumnProperties(String value) { this.showExtraColumnProperties = value; }

    public String getShowInOutFlowButtonsInDataFlowDiagram() { return showInOutFlowButtonsInDataFlowDiagram; }
    public void setShowInOutFlowButtonsInDataFlowDiagram(String value) { this.showInOutFlowButtonsInDataFlowDiagram = value; }

    public String getShowInOutFlowsInSubLevelDiagram() { return showInOutFlowsInSubLevelDiagram; }
    public void setShowInOutFlowsInSubLevelDiagram(String value) { this.showInOutFlowsInSubLevelDiagram = value; }

    public String getShowMessageOperationSignatureForSequenceAndCommunicationDiagram() { return showMessageOperationSignatureForSequenceAndCommunicationDiagram; }
    public void setShowMessageOperationSignatureForSequenceAndCommunicationDiagram(String value) { this.showMessageOperationSignatureForSequenceAndCommunicationDiagram = value; }

    public String getShowMessageStereotypeInSequenceAndCommunicationDiagram() { return showMessageStereotypeInSequenceAndCommunicationDiagram; }
    public void setShowMessageStereotypeInSequenceAndCommunicationDiagram(String value) { this.showMessageStereotypeInSequenceAndCommunicationDiagram = value; }

    public String getShowNumberInCollaborationDiagram() { return showNumberInCollaborationDiagram; }
    public void setShowNumberInCollaborationDiagram(String value) { this.showNumberInCollaborationDiagram = value; }

    public String getShowNumberInSequenceDiagram() { return showNumberInSequenceDiagram; }
    public void setShowNumberInSequenceDiagram(String value) { this.showNumberInSequenceDiagram = value; }

    public String getShowPackageNameStyle() { return showPackageNameStyle; }
    public void setShowPackageNameStyle(String value) { this.showPackageNameStyle = value; }

    public String getShowParameterNameInOperationSignature() { return showParameterNameInOperationSignature; }
    public void setShowParameterNameInOperationSignature(String value) { this.showParameterNameInOperationSignature = value; }

    public String getShowRowGridLineWithinCompClassDiagram() { return showRowGridLineWithinCompClassDiagram; }
    public void setShowRowGridLineWithinCompClassDiagram(String value) { this.showRowGridLineWithinCompClassDiagram = value; }

    public String getShowRowGridLineWithinCompERD() { return showRowGridLineWithinCompERD; }
    public void setShowRowGridLineWithinCompERD(String value) { this.showRowGridLineWithinCompERD = value; }

    public String getShowRowGridLineWithinORMDiagram() { return showRowGridLineWithinORMDiagram; }
    public void setShowRowGridLineWithinORMDiagram(String value) { this.showRowGridLineWithinORMDiagram = value; }

    public String getShowSchemaNameInERD() { return showSchemaNameInERD; }
    public void setShowSchemaNameInERD(String value) { this.showSchemaNameInERD = value; }

    public String getShowTransitionTrigger() { return showTransitionTrigger; }
    public void setShowTransitionTrigger(String value) { this.showTransitionTrigger = value; }

    public String getShowUseCaseExtensionPoint() { return showUseCaseExtensionPoint; }
    public void setShowUseCaseExtensionPoint(String value) { this.showUseCaseExtensionPoint = value; }

    public String getShowUseCaseID() { return showUseCaseID; }
    public void setShowUseCaseID(String value) { this.showUseCaseID = value; }

    public String getSnapConnectorsAfterZoom() { return snapConnectorsAfterZoom; }
    public void setSnapConnectorsAfterZoom(String value) { this.snapConnectorsAfterZoom = value; }

    public String getStateShowParametersOfInternalActivities() { return stateShowParametersOfInternalActivities; }
    public void setStateShowParametersOfInternalActivities(String value) { this.stateShowParametersOfInternalActivities = value; }

    public String getStateShowPrePostConditionAndBodyOfInternalActivities() { return stateShowPrePostConditionAndBodyOfInternalActivities; }
    public void setStateShowPrePostConditionAndBodyOfInternalActivities(String value) { this.stateShowPrePostConditionAndBodyOfInternalActivities = value; }

    public String getStopTargetLifelineOnCreateDestroyMessage() { return stopTargetLifelineOnCreateDestroyMessage; }
    public void setStopTargetLifelineOnCreateDestroyMessage(String value) { this.stopTargetLifelineOnCreateDestroyMessage = value; }

    public String getSupportHTMLTaggedValue() { return supportHTMLTaggedValue; }
    public void setSupportHTMLTaggedValue(String value) { this.supportHTMLTaggedValue = value; }

    public String getSupportMultipleLineAttribute() { return supportMultipleLineAttribute; }
    public void setSupportMultipleLineAttribute(String value) { this.supportMultipleLineAttribute = value; }

    public String getSuppressImpliedMultiplicityForAttributeAssociationEnd() { return suppressImpliedMultiplicityForAttributeAssociationEnd; }
    public void setSuppressImpliedMultiplicityForAttributeAssociationEnd(String value) { this.suppressImpliedMultiplicityForAttributeAssociationEnd = value; }

    public String getSyncAssociationNameWithAssociationClass() { return syncAssociationNameWithAssociationClass; }
    public void setSyncAssociationNameWithAssociationClass(String value) { this.syncAssociationNameWithAssociationClass = value; }

    public String getSyncAssociationRoleNameWithReferencedAttributeName() { return syncAssociationRoleNameWithReferencedAttributeName; }
    public void setSyncAssociationRoleNameWithReferencedAttributeName(String value) { this.syncAssociationRoleNameWithReferencedAttributeName = value; }

    public String getSyncDocOfInterfaceToSubClass() { return syncDocOfInterfaceToSubClass; }
    public void setSyncDocOfInterfaceToSubClass(String value) { this.syncDocOfInterfaceToSubClass = value; }

    public String getTextAntiAliasing() { return textAntiAliasing; }
    public void setTextAntiAliasing(String value) { this.textAntiAliasing = value; }

    public String getTextualAnalysisGenerateRequirementTextOption() { return textualAnalysisGenerateRequirementTextOption; }
    public void setTextualAnalysisGenerateRequirementTextOption(String value) { this.textualAnalysisGenerateRequirementTextOption = value; }

    public String getTextualAnalysisHighlightOption() { return textualAnalysisHighlightOption; }
    public void setTextualAnalysisHighlightOption(String value) { this.textualAnalysisHighlightOption = value; }

    public String getUnnamedIndexPattern() { return unnamedIndexPattern; }
    public void setUnnamedIndexPattern(String value) { this.unnamedIndexPattern = value; }

    public String getUseStateNameTab() { return useStateNameTab; }
    public void setUseStateNameTab(String value) { this.useStateNameTab = value; }

    public String getWireflowDiagramDevice() { return wireflowDiagramDevice; }
    public void setWireflowDiagramDevice(String value) { this.wireflowDiagramDevice = value; }

    public String getWireflowDiagramShowActiveFlowLabel() { return wireflowDiagramShowActiveFlowLabel; }
    public void setWireflowDiagramShowActiveFlowLabel(String value) { this.wireflowDiagramShowActiveFlowLabel = value; }

    public String getWireflowDiagramTheme() { return wireflowDiagramTheme; }
    public void setWireflowDiagramTheme(String value) { this.wireflowDiagramTheme = value; }

    public String getWireflowDiagramWireflowShowPreview() { return wireflowDiagramWireflowShowPreview; }
    public void setWireflowDiagramWireflowShowPreview(String value) { this.wireflowDiagramWireflowShowPreview = value; }

    public String getWireflowDiagramWireflowShowScreenID() { return wireflowDiagramWireflowShowScreenID; }
    public void setWireflowDiagramWireflowShowScreenID(String value) { this.wireflowDiagramWireflowShowScreenID = value; }
}

// DefaultHTMLDocFont.java

package io.codebeautify;

public class DefaultHTMLDocFont {
    private Family family;
    private String size;
    private String style;

    public Family getFamily() { return family; }
    public void setFamily(Family value) { this.family = value; }

    public String getSize() { return size; }
    public void setSize(String value) { this.size = value; }

    public String getStyle() { return style; }
    public void setStyle(String value) { this.style = value; }
}

// GeneralOptions.java

package io.codebeautify;

public class GeneralOptions {
    private String confirmSubLevelIDWithDot;
    private String quickAddGlossaryTermParentModelID;

    public String getConfirmSubLevelIDWithDot() { return confirmSubLevelIDWithDot; }
    public void setConfirmSubLevelIDWithDot(String value) { this.confirmSubLevelIDWithDot = value; }

    public String getQuickAddGlossaryTermParentModelID() { return quickAddGlossaryTermParentModelID; }
    public void setQuickAddGlossaryTermParentModelID(String value) { this.quickAddGlossaryTermParentModelID = value; }
}

// InstantReverseOptions.java

package io.codebeautify;

public class InstantReverseOptions {
    private String calculateGeneralizationAndRealization;
    private String createShapeForParentModelOfDraggedClassPackage;
    private String reverseGetterSetter;
    private String reverseOperationImplementation;
    private String showPackageForNewDiagram;
    private String showPackageOwner;

    public String getCalculateGeneralizationAndRealization() { return calculateGeneralizationAndRealization; }
    public void setCalculateGeneralizationAndRealization(String value) { this.calculateGeneralizationAndRealization = value; }

    public String getCreateShapeForParentModelOfDraggedClassPackage() { return createShapeForParentModelOfDraggedClassPackage; }
    public void setCreateShapeForParentModelOfDraggedClassPackage(String value) { this.createShapeForParentModelOfDraggedClassPackage = value; }

    public String getReverseGetterSetter() { return reverseGetterSetter; }
    public void setReverseGetterSetter(String value) { this.reverseGetterSetter = value; }

    public String getReverseOperationImplementation() { return reverseOperationImplementation; }
    public void setReverseOperationImplementation(String value) { this.reverseOperationImplementation = value; }

    public String getShowPackageForNewDiagram() { return showPackageForNewDiagram; }
    public void setShowPackageForNewDiagram(String value) { this.showPackageForNewDiagram = value; }

    public String getShowPackageOwner() { return showPackageOwner; }
    public void setShowPackageOwner(String value) { this.showPackageOwner = value; }
}

// ModelQualityOptions.java

package io.codebeautify;

public class ModelQualityOptions {
    private String enableModelQualityChecking;

    public String getEnableModelQualityChecking() { return enableModelQualityChecking; }
    public void setEnableModelQualityChecking(String value) { this.enableModelQualityChecking = value; }
}

// ORMOptions.java

package io.codebeautify;

public class ORMOptions {
    private String decimalPrecision;
    private String decimalScale;
    private String exportCommentToDatabase;
    private String formattedSQL;
    private String generateAssociationWithAttribute;
    private String generateDiagramFromORMWizards;
    private String getterSetterVisibility;
    private String idGeneratorType;
    private String mappingFileColumnOrder;
    private String numericToClassType;
    private String quoteSQLIdentifier;
    private String recreateShapeWhenSync;
    private String syncToClassDiagramAttributeName;
    private String syncToClassDiagramAttributeNamePrefix;
    private String syncToClassDiagramAttributeNameSuffix;
    private String syncToClassDiagramClassName;
    private String syncToClassDiagramClassNamePrefix;
    private String syncToClassDiagramClassNameSuffix;
    private String syncToERDColumnName;
    private String syncToERDColumnNamePrefix;
    private String syncToERDColumnNameSuffix;
    private String syncToERDTableName;
    private String syncToERDTableNamePrefix;
    private String syncToERDTableNameSuffix;
    private String synchronizeDefaultValueToColumn;
    private String synchronizeName;
    private String tablePerSubclassFKMapping;
    private String upperCaseSQL;
    private String useDefaultDecimal;
    private String wrappingServletRequest;

    public String getDecimalPrecision() { return decimalPrecision; }
    public void setDecimalPrecision(String value) { this.decimalPrecision = value; }

    public String getDecimalScale() { return decimalScale; }
    public void setDecimalScale(String value) { this.decimalScale = value; }

    public String getExportCommentToDatabase() { return exportCommentToDatabase; }
    public void setExportCommentToDatabase(String value) { this.exportCommentToDatabase = value; }

    public String getFormattedSQL() { return formattedSQL; }
    public void setFormattedSQL(String value) { this.formattedSQL = value; }

    public String getGenerateAssociationWithAttribute() { return generateAssociationWithAttribute; }
    public void setGenerateAssociationWithAttribute(String value) { this.generateAssociationWithAttribute = value; }

    public String getGenerateDiagramFromORMWizards() { return generateDiagramFromORMWizards; }
    public void setGenerateDiagramFromORMWizards(String value) { this.generateDiagramFromORMWizards = value; }

    public String getGetterSetterVisibility() { return getterSetterVisibility; }
    public void setGetterSetterVisibility(String value) { this.getterSetterVisibility = value; }

    public String getIDGeneratorType() { return idGeneratorType; }
    public void setIDGeneratorType(String value) { this.idGeneratorType = value; }

    public String getMappingFileColumnOrder() { return mappingFileColumnOrder; }
    public void setMappingFileColumnOrder(String value) { this.mappingFileColumnOrder = value; }

    public String getNumericToClassType() { return numericToClassType; }
    public void setNumericToClassType(String value) { this.numericToClassType = value; }

    public String getQuoteSQLIdentifier() { return quoteSQLIdentifier; }
    public void setQuoteSQLIdentifier(String value) { this.quoteSQLIdentifier = value; }

    public String getRecreateShapeWhenSync() { return recreateShapeWhenSync; }
    public void setRecreateShapeWhenSync(String value) { this.recreateShapeWhenSync = value; }

    public String getSyncToClassDiagramAttributeName() { return syncToClassDiagramAttributeName; }
    public void setSyncToClassDiagramAttributeName(String value) { this.syncToClassDiagramAttributeName = value; }

    public String getSyncToClassDiagramAttributeNamePrefix() { return syncToClassDiagramAttributeNamePrefix; }
    public void setSyncToClassDiagramAttributeNamePrefix(String value) { this.syncToClassDiagramAttributeNamePrefix = value; }

    public String getSyncToClassDiagramAttributeNameSuffix() { return syncToClassDiagramAttributeNameSuffix; }
    public void setSyncToClassDiagramAttributeNameSuffix(String value) { this.syncToClassDiagramAttributeNameSuffix = value; }

    public String getSyncToClassDiagramClassName() { return syncToClassDiagramClassName; }
    public void setSyncToClassDiagramClassName(String value) { this.syncToClassDiagramClassName = value; }

    public String getSyncToClassDiagramClassNamePrefix() { return syncToClassDiagramClassNamePrefix; }
    public void setSyncToClassDiagramClassNamePrefix(String value) { this.syncToClassDiagramClassNamePrefix = value; }

    public String getSyncToClassDiagramClassNameSuffix() { return syncToClassDiagramClassNameSuffix; }
    public void setSyncToClassDiagramClassNameSuffix(String value) { this.syncToClassDiagramClassNameSuffix = value; }

    public String getSyncToERDColumnName() { return syncToERDColumnName; }
    public void setSyncToERDColumnName(String value) { this.syncToERDColumnName = value; }

    public String getSyncToERDColumnNamePrefix() { return syncToERDColumnNamePrefix; }
    public void setSyncToERDColumnNamePrefix(String value) { this.syncToERDColumnNamePrefix = value; }

    public String getSyncToERDColumnNameSuffix() { return syncToERDColumnNameSuffix; }
    public void setSyncToERDColumnNameSuffix(String value) { this.syncToERDColumnNameSuffix = value; }

    public String getSyncToERDTableName() { return syncToERDTableName; }
    public void setSyncToERDTableName(String value) { this.syncToERDTableName = value; }

    public String getSyncToERDTableNamePrefix() { return syncToERDTableNamePrefix; }
    public void setSyncToERDTableNamePrefix(String value) { this.syncToERDTableNamePrefix = value; }

    public String getSyncToERDTableNameSuffix() { return syncToERDTableNameSuffix; }
    public void setSyncToERDTableNameSuffix(String value) { this.syncToERDTableNameSuffix = value; }

    public String getSynchronizeDefaultValueToColumn() { return synchronizeDefaultValueToColumn; }
    public void setSynchronizeDefaultValueToColumn(String value) { this.synchronizeDefaultValueToColumn = value; }

    public String getSynchronizeName() { return synchronizeName; }
    public void setSynchronizeName(String value) { this.synchronizeName = value; }

    public String getTablePerSubclassFKMapping() { return tablePerSubclassFKMapping; }
    public void setTablePerSubclassFKMapping(String value) { this.tablePerSubclassFKMapping = value; }

    public String getUpperCaseSQL() { return upperCaseSQL; }
    public void setUpperCaseSQL(String value) { this.upperCaseSQL = value; }

    public String getUseDefaultDecimal() { return useDefaultDecimal; }
    public void setUseDefaultDecimal(String value) { this.useDefaultDecimal = value; }

    public String getWrappingServletRequest() { return wrappingServletRequest; }
    public void setWrappingServletRequest(String value) { this.wrappingServletRequest = value; }
}

// PORepository.java

package io.codebeautify;

public class PORepository {
    private POUserIDFormats poUserIDFormats;

    public POUserIDFormats getPoUserIDFormats() { return poUserIDFormats; }
    public void setPoUserIDFormats(POUserIDFormats value) { this.poUserIDFormats = value; }
}

// POUserIDFormats.java

package io.codebeautify;

public class POUserIDFormats {
    private POUserIDFormat[] poUserIDFormat;

    public POUserIDFormat[] getPoUserIDFormat() { return poUserIDFormat; }
    public void setPoUserIDFormat(POUserIDFormat[] value) { this.poUserIDFormat = value; }
}

// POUserIDFormat.java

package io.codebeautify;

public class POUserIDFormat {
    private String digits;
    private String guid;
    private String id;
    private String lastNumericValue;
    private String modelType;
    private String prefix;
    private String suffix;

    public String getDigits() { return digits; }
    public void setDigits(String value) { this.digits = value; }

    public String getGUID() { return guid; }
    public void setGUID(String value) { this.guid = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public String getLastNumericValue() { return lastNumericValue; }
    public void setLastNumericValue(String value) { this.lastNumericValue = value; }

    public String getModelType() { return modelType; }
    public void setModelType(String value) { this.modelType = value; }

    public String getPrefix() { return prefix; }
    public void setPrefix(String value) { this.prefix = value; }

    public String getSuffix() { return suffix; }
    public void setSuffix(String value) { this.suffix = value; }
}

// RequirementDiagramOptions.java

package io.codebeautify;

public class RequirementDiagramOptions {
    private String defaultWrapMember;
    private String showAttributes;
    private String supportHTMLAttribute;

    public String getDefaultWrapMember() { return defaultWrapMember; }
    public void setDefaultWrapMember(String value) { this.defaultWrapMember = value; }

    public String getShowAttributes() { return showAttributes; }
    public void setShowAttributes(String value) { this.showAttributes = value; }

    public String getSupportHTMLAttribute() { return supportHTMLAttribute; }
    public void setSupportHTMLAttribute(String value) { this.supportHTMLAttribute = value; }
}

// StateCodeEngineOptions.java

package io.codebeautify;

public class StateCodeEngineOptions {
    private String autoCreateInitialStateInStateDiagram;
    private String autoCreateTransitionMethods;
    private String defaultInitialStateLocationX;
    private String defaultInitialStateLocationY;
    private String generateDebugMessage;
    private String generateSample;
    private String generateTryCatch;
    private String language;
    private String regenerateTransitionMethods;
    private String syncTransitionMethods;

    public String getAutoCreateInitialStateInStateDiagram() { return autoCreateInitialStateInStateDiagram; }
    public void setAutoCreateInitialStateInStateDiagram(String value) { this.autoCreateInitialStateInStateDiagram = value; }

    public String getAutoCreateTransitionMethods() { return autoCreateTransitionMethods; }
    public void setAutoCreateTransitionMethods(String value) { this.autoCreateTransitionMethods = value; }

    public String getDefaultInitialStateLocationX() { return defaultInitialStateLocationX; }
    public void setDefaultInitialStateLocationX(String value) { this.defaultInitialStateLocationX = value; }

    public String getDefaultInitialStateLocationY() { return defaultInitialStateLocationY; }
    public void setDefaultInitialStateLocationY(String value) { this.defaultInitialStateLocationY = value; }

    public String getGenerateDebugMessage() { return generateDebugMessage; }
    public void setGenerateDebugMessage(String value) { this.generateDebugMessage = value; }

    public String getGenerateSample() { return generateSample; }
    public void setGenerateSample(String value) { this.generateSample = value; }

    public String getGenerateTryCatch() { return generateTryCatch; }
    public void setGenerateTryCatch(String value) { this.generateTryCatch = value; }

    public String getLanguage() { return language; }
    public void setLanguage(String value) { this.language = value; }

    public String getRegenerateTransitionMethods() { return regenerateTransitionMethods; }
    public void setRegenerateTransitionMethods(String value) { this.regenerateTransitionMethods = value; }

    public String getSyncTransitionMethods() { return syncTransitionMethods; }
    public void setSyncTransitionMethods(String value) { this.syncTransitionMethods = value; }
}

// WarningOptions.java

package io.codebeautify;

public class WarningOptions {
    private String createORMClassInDefaultPackage;

    public String getCreateORMClassInDefaultPackage() { return createORMClassInDefaultPackage; }
    public void setCreateORMClassInDefaultPackage(String value) { this.createORMClassInDefaultPackage = value; }
}
