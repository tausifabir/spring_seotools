package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class Audits {
    private CumulativeLayoutShift usesResponsiveImages;
    private CriticalRequestChains unusedJavascript;
    private DOMSize networkRtt;
    private FinalScreenshot finalScreenshot;
    private FontDisplay layoutShiftElements;
    private BootupTime firstContentfulPaint3G;
    private FinalScreenshot performanceBudget;
    private BootupTime mainthreadWorkBreakdown;
    private FullPageScreenshot usesPassiveEventListeners;
    private CumulativeLayoutShift metrics;
    private BootupTime totalBlockingTime;
    private CumulativeLayoutShift cumulativeLayoutShift;
    private FontDisplay networkRequests;
    private CriticalRequestChains unminifiedJavascript;
    private DOMSize domSize;
    private DuplicatedJavascript legacyJavascript;
    private CumulativeLayoutShift usesTextCompression;
    private DuplicatedJavascript efficientAnimatedContent;
    private CriticalRequestChains interactive;
    private Diagnostics noDocumentWrite;
    private BootupTime firstContentfulPaint;
    private FontDisplay fontDisplay;
    private CriticalRequestChains serverResponseTime;
    private BootupTime totalByteWeight;
    private BootupTime bootupTime;
    private CumulativeLayoutShift usesRelPreconnect;
    private FinalScreenshot screenshotThumbnails;
    private CriticalRequestChains largestContentfulPaint;
    private FullPageScreenshot usesRelPreload;
    private FinalScreenshot renderBlockingResources;
    private DOMSize networkServerLatency;
    private BootupTime usesOptimizedImages;
    private CumulativeLayoutShift maxPotentialFid;
    private FinalScreenshot redirects;
    private DuplicatedJavascript modernImageFormats;
    private DOMSize resourceSummary;
    private DuplicatedJavascript thirdPartySummary;
    private CriticalRequestChains offscreenImages;
    private FinalScreenshot preloadLcpImage;
    private FullPageScreenshot timingBudget;
    private Diagnostics lcpLazyLoaded;
    private FontDisplay longTasks;
    private CriticalRequestChains nonCompositedAnimations;
    private CriticalRequestChains criticalRequestChains;
    private FullPageScreenshot thirdPartyFacades;
    private Diagnostics scriptTreemapData;
    private DuplicatedJavascript usesLongCacheTTL;
    private Diagnostics mainThreadTasks;
    private BootupTime firstMeaningfulPaint;
    private CriticalRequestChains unusedCSSRules;
    private FullPageScreenshot viewport;
    private DuplicatedJavascript duplicatedJavascript;
    private DuplicatedJavascript speedIndex;
    private Diagnostics diagnostics;
    private FullPageScreenshot unsizedImages;
    private FullPageScreenshot fullPageScreenshot;
    private CriticalRequestChains largestContentfulPaintElement;
    private CumulativeLayoutShift unminifiedCSS;
    private FullPageScreenshot userTimings;

    @JsonProperty("uses-responsive-images")
    public CumulativeLayoutShift getUsesResponsiveImages() { return usesResponsiveImages; }
    @JsonProperty("uses-responsive-images")
    public void setUsesResponsiveImages(CumulativeLayoutShift value) { this.usesResponsiveImages = value; }

    @JsonProperty("unused-javascript")
    public CriticalRequestChains getUnusedJavascript() { return unusedJavascript; }
    @JsonProperty("unused-javascript")
    public void setUnusedJavascript(CriticalRequestChains value) { this.unusedJavascript = value; }

    @JsonProperty("network-rtt")
    public DOMSize getNetworkRtt() { return networkRtt; }
    @JsonProperty("network-rtt")
    public void setNetworkRtt(DOMSize value) { this.networkRtt = value; }

    @JsonProperty("final-screenshot")
    public FinalScreenshot getFinalScreenshot() { return finalScreenshot; }
    @JsonProperty("final-screenshot")
    public void setFinalScreenshot(FinalScreenshot value) { this.finalScreenshot = value; }

    @JsonProperty("layout-shift-elements")
    public FontDisplay getLayoutShiftElements() { return layoutShiftElements; }
    @JsonProperty("layout-shift-elements")
    public void setLayoutShiftElements(FontDisplay value) { this.layoutShiftElements = value; }

    @JsonProperty("first-contentful-paint-3g")
    public BootupTime getFirstContentfulPaint3G() { return firstContentfulPaint3G; }
    @JsonProperty("first-contentful-paint-3g")
    public void setFirstContentfulPaint3G(BootupTime value) { this.firstContentfulPaint3G = value; }

    @JsonProperty("performance-budget")
    public FinalScreenshot getPerformanceBudget() { return performanceBudget; }
    @JsonProperty("performance-budget")
    public void setPerformanceBudget(FinalScreenshot value) { this.performanceBudget = value; }

    @JsonProperty("mainthread-work-breakdown")
    public BootupTime getMainthreadWorkBreakdown() { return mainthreadWorkBreakdown; }
    @JsonProperty("mainthread-work-breakdown")
    public void setMainthreadWorkBreakdown(BootupTime value) { this.mainthreadWorkBreakdown = value; }

    @JsonProperty("uses-passive-event-listeners")
    public FullPageScreenshot getUsesPassiveEventListeners() { return usesPassiveEventListeners; }
    @JsonProperty("uses-passive-event-listeners")
    public void setUsesPassiveEventListeners(FullPageScreenshot value) { this.usesPassiveEventListeners = value; }

    @JsonProperty("metrics")
    public CumulativeLayoutShift getMetrics() { return metrics; }
    @JsonProperty("metrics")
    public void setMetrics(CumulativeLayoutShift value) { this.metrics = value; }

    @JsonProperty("total-blocking-time")
    public BootupTime getTotalBlockingTime() { return totalBlockingTime; }
    @JsonProperty("total-blocking-time")
    public void setTotalBlockingTime(BootupTime value) { this.totalBlockingTime = value; }

    @JsonProperty("cumulative-layout-shift")
    public CumulativeLayoutShift getCumulativeLayoutShift() { return cumulativeLayoutShift; }
    @JsonProperty("cumulative-layout-shift")
    public void setCumulativeLayoutShift(CumulativeLayoutShift value) { this.cumulativeLayoutShift = value; }

    @JsonProperty("network-requests")
    public FontDisplay getNetworkRequests() { return networkRequests; }
    @JsonProperty("network-requests")
    public void setNetworkRequests(FontDisplay value) { this.networkRequests = value; }

    @JsonProperty("unminified-javascript")
    public CriticalRequestChains getUnminifiedJavascript() { return unminifiedJavascript; }
    @JsonProperty("unminified-javascript")
    public void setUnminifiedJavascript(CriticalRequestChains value) { this.unminifiedJavascript = value; }

    @JsonProperty("dom-size")
    public DOMSize getDOMSize() { return domSize; }
    @JsonProperty("dom-size")
    public void setDOMSize(DOMSize value) { this.domSize = value; }

    @JsonProperty("legacy-javascript")
    public DuplicatedJavascript getLegacyJavascript() { return legacyJavascript; }
    @JsonProperty("legacy-javascript")
    public void setLegacyJavascript(DuplicatedJavascript value) { this.legacyJavascript = value; }

    @JsonProperty("uses-text-compression")
    public CumulativeLayoutShift getUsesTextCompression() { return usesTextCompression; }
    @JsonProperty("uses-text-compression")
    public void setUsesTextCompression(CumulativeLayoutShift value) { this.usesTextCompression = value; }

    @JsonProperty("efficient-animated-content")
    public DuplicatedJavascript getEfficientAnimatedContent() { return efficientAnimatedContent; }
    @JsonProperty("efficient-animated-content")
    public void setEfficientAnimatedContent(DuplicatedJavascript value) { this.efficientAnimatedContent = value; }

    @JsonProperty("interactive")
    public CriticalRequestChains getInteractive() { return interactive; }
    @JsonProperty("interactive")
    public void setInteractive(CriticalRequestChains value) { this.interactive = value; }

    @JsonProperty("no-document-write")
    public Diagnostics getNoDocumentWrite() { return noDocumentWrite; }
    @JsonProperty("no-document-write")
    public void setNoDocumentWrite(Diagnostics value) { this.noDocumentWrite = value; }

    @JsonProperty("first-contentful-paint")
    public BootupTime getFirstContentfulPaint() { return firstContentfulPaint; }
    @JsonProperty("first-contentful-paint")
    public void setFirstContentfulPaint(BootupTime value) { this.firstContentfulPaint = value; }

    @JsonProperty("font-display")
    public FontDisplay getFontDisplay() { return fontDisplay; }
    @JsonProperty("font-display")
    public void setFontDisplay(FontDisplay value) { this.fontDisplay = value; }

    @JsonProperty("server-response-time")
    public CriticalRequestChains getServerResponseTime() { return serverResponseTime; }
    @JsonProperty("server-response-time")
    public void setServerResponseTime(CriticalRequestChains value) { this.serverResponseTime = value; }

    @JsonProperty("total-byte-weight")
    public BootupTime getTotalByteWeight() { return totalByteWeight; }
    @JsonProperty("total-byte-weight")
    public void setTotalByteWeight(BootupTime value) { this.totalByteWeight = value; }

    @JsonProperty("bootup-time")
    public BootupTime getBootupTime() { return bootupTime; }
    @JsonProperty("bootup-time")
    public void setBootupTime(BootupTime value) { this.bootupTime = value; }

    @JsonProperty("uses-rel-preconnect")
    public CumulativeLayoutShift getUsesRelPreconnect() { return usesRelPreconnect; }
    @JsonProperty("uses-rel-preconnect")
    public void setUsesRelPreconnect(CumulativeLayoutShift value) { this.usesRelPreconnect = value; }

    @JsonProperty("screenshot-thumbnails")
    public FinalScreenshot getScreenshotThumbnails() { return screenshotThumbnails; }
    @JsonProperty("screenshot-thumbnails")
    public void setScreenshotThumbnails(FinalScreenshot value) { this.screenshotThumbnails = value; }

    @JsonProperty("largest-contentful-paint")
    public CriticalRequestChains getLargestContentfulPaint() { return largestContentfulPaint; }
    @JsonProperty("largest-contentful-paint")
    public void setLargestContentfulPaint(CriticalRequestChains value) { this.largestContentfulPaint = value; }

    @JsonProperty("uses-rel-preload")
    public FullPageScreenshot getUsesRelPreload() { return usesRelPreload; }
    @JsonProperty("uses-rel-preload")
    public void setUsesRelPreload(FullPageScreenshot value) { this.usesRelPreload = value; }

    @JsonProperty("render-blocking-resources")
    public FinalScreenshot getRenderBlockingResources() { return renderBlockingResources; }
    @JsonProperty("render-blocking-resources")
    public void setRenderBlockingResources(FinalScreenshot value) { this.renderBlockingResources = value; }

    @JsonProperty("network-server-latency")
    public DOMSize getNetworkServerLatency() { return networkServerLatency; }
    @JsonProperty("network-server-latency")
    public void setNetworkServerLatency(DOMSize value) { this.networkServerLatency = value; }

    @JsonProperty("uses-optimized-images")
    public BootupTime getUsesOptimizedImages() { return usesOptimizedImages; }
    @JsonProperty("uses-optimized-images")
    public void setUsesOptimizedImages(BootupTime value) { this.usesOptimizedImages = value; }

    @JsonProperty("max-potential-fid")
    public CumulativeLayoutShift getMaxPotentialFid() { return maxPotentialFid; }
    @JsonProperty("max-potential-fid")
    public void setMaxPotentialFid(CumulativeLayoutShift value) { this.maxPotentialFid = value; }

    @JsonProperty("redirects")
    public FinalScreenshot getRedirects() { return redirects; }
    @JsonProperty("redirects")
    public void setRedirects(FinalScreenshot value) { this.redirects = value; }

    @JsonProperty("modern-image-formats")
    public DuplicatedJavascript getModernImageFormats() { return modernImageFormats; }
    @JsonProperty("modern-image-formats")
    public void setModernImageFormats(DuplicatedJavascript value) { this.modernImageFormats = value; }

    @JsonProperty("resource-summary")
    public DOMSize getResourceSummary() { return resourceSummary; }
    @JsonProperty("resource-summary")
    public void setResourceSummary(DOMSize value) { this.resourceSummary = value; }

    @JsonProperty("third-party-summary")
    public DuplicatedJavascript getThirdPartySummary() { return thirdPartySummary; }
    @JsonProperty("third-party-summary")
    public void setThirdPartySummary(DuplicatedJavascript value) { this.thirdPartySummary = value; }

    @JsonProperty("offscreen-images")
    public CriticalRequestChains getOffscreenImages() { return offscreenImages; }
    @JsonProperty("offscreen-images")
    public void setOffscreenImages(CriticalRequestChains value) { this.offscreenImages = value; }

    @JsonProperty("preload-lcp-image")
    public FinalScreenshot getPreloadLcpImage() { return preloadLcpImage; }
    @JsonProperty("preload-lcp-image")
    public void setPreloadLcpImage(FinalScreenshot value) { this.preloadLcpImage = value; }

    @JsonProperty("timing-budget")
    public FullPageScreenshot getTimingBudget() { return timingBudget; }
    @JsonProperty("timing-budget")
    public void setTimingBudget(FullPageScreenshot value) { this.timingBudget = value; }

    @JsonProperty("lcp-lazy-loaded")
    public Diagnostics getLcpLazyLoaded() { return lcpLazyLoaded; }
    @JsonProperty("lcp-lazy-loaded")
    public void setLcpLazyLoaded(Diagnostics value) { this.lcpLazyLoaded = value; }

    @JsonProperty("long-tasks")
    public FontDisplay getLongTasks() { return longTasks; }
    @JsonProperty("long-tasks")
    public void setLongTasks(FontDisplay value) { this.longTasks = value; }

    @JsonProperty("non-composited-animations")
    public CriticalRequestChains getNonCompositedAnimations() { return nonCompositedAnimations; }
    @JsonProperty("non-composited-animations")
    public void setNonCompositedAnimations(CriticalRequestChains value) { this.nonCompositedAnimations = value; }

    @JsonProperty("critical-request-chains")
    public CriticalRequestChains getCriticalRequestChains() { return criticalRequestChains; }
    @JsonProperty("critical-request-chains")
    public void setCriticalRequestChains(CriticalRequestChains value) { this.criticalRequestChains = value; }

    @JsonProperty("third-party-facades")
    public FullPageScreenshot getThirdPartyFacades() { return thirdPartyFacades; }
    @JsonProperty("third-party-facades")
    public void setThirdPartyFacades(FullPageScreenshot value) { this.thirdPartyFacades = value; }

    @JsonProperty("script-treemap-data")
    public Diagnostics getScriptTreemapData() { return scriptTreemapData; }
    @JsonProperty("script-treemap-data")
    public void setScriptTreemapData(Diagnostics value) { this.scriptTreemapData = value; }

    @JsonProperty("uses-long-cache-ttl")
    public DuplicatedJavascript getUsesLongCacheTTL() { return usesLongCacheTTL; }
    @JsonProperty("uses-long-cache-ttl")
    public void setUsesLongCacheTTL(DuplicatedJavascript value) { this.usesLongCacheTTL = value; }

    @JsonProperty("main-thread-tasks")
    public Diagnostics getMainThreadTasks() { return mainThreadTasks; }
    @JsonProperty("main-thread-tasks")
    public void setMainThreadTasks(Diagnostics value) { this.mainThreadTasks = value; }

    @JsonProperty("first-meaningful-paint")
    public BootupTime getFirstMeaningfulPaint() { return firstMeaningfulPaint; }
    @JsonProperty("first-meaningful-paint")
    public void setFirstMeaningfulPaint(BootupTime value) { this.firstMeaningfulPaint = value; }

    @JsonProperty("unused-css-rules")
    public CriticalRequestChains getUnusedCSSRules() { return unusedCSSRules; }
    @JsonProperty("unused-css-rules")
    public void setUnusedCSSRules(CriticalRequestChains value) { this.unusedCSSRules = value; }

    @JsonProperty("viewport")
    public FullPageScreenshot getViewport() { return viewport; }
    @JsonProperty("viewport")
    public void setViewport(FullPageScreenshot value) { this.viewport = value; }

    @JsonProperty("duplicated-javascript")
    public DuplicatedJavascript getDuplicatedJavascript() { return duplicatedJavascript; }
    @JsonProperty("duplicated-javascript")
    public void setDuplicatedJavascript(DuplicatedJavascript value) { this.duplicatedJavascript = value; }

    @JsonProperty("speed-index")
    public DuplicatedJavascript getSpeedIndex() { return speedIndex; }
    @JsonProperty("speed-index")
    public void setSpeedIndex(DuplicatedJavascript value) { this.speedIndex = value; }

    @JsonProperty("diagnostics")
    public Diagnostics getDiagnostics() { return diagnostics; }
    @JsonProperty("diagnostics")
    public void setDiagnostics(Diagnostics value) { this.diagnostics = value; }

    @JsonProperty("unsized-images")
    public FullPageScreenshot getUnsizedImages() { return unsizedImages; }
    @JsonProperty("unsized-images")
    public void setUnsizedImages(FullPageScreenshot value) { this.unsizedImages = value; }

    @JsonProperty("full-page-screenshot")
    public FullPageScreenshot getFullPageScreenshot() { return fullPageScreenshot; }
    @JsonProperty("full-page-screenshot")
    public void setFullPageScreenshot(FullPageScreenshot value) { this.fullPageScreenshot = value; }

    @JsonProperty("largest-contentful-paint-element")
    public CriticalRequestChains getLargestContentfulPaintElement() { return largestContentfulPaintElement; }
    @JsonProperty("largest-contentful-paint-element")
    public void setLargestContentfulPaintElement(CriticalRequestChains value) { this.largestContentfulPaintElement = value; }

    @JsonProperty("unminified-css")
    public CumulativeLayoutShift getUnminifiedCSS() { return unminifiedCSS; }
    @JsonProperty("unminified-css")
    public void setUnminifiedCSS(CumulativeLayoutShift value) { this.unminifiedCSS = value; }

    @JsonProperty("user-timings")
    public FullPageScreenshot getUserTimings() { return userTimings; }
    @JsonProperty("user-timings")
    public void setUserTimings(FullPageScreenshot value) { this.userTimings = value; }
}
